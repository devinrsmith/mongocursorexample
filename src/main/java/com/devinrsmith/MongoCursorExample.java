package com.devinrsmith;


import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class MongoCursorExample {
    private final DBCollection oplog;
    private final CountDownLatch latch;

    public MongoCursorExample(DBCollection oplog, int n) {
        this.oplog = oplog;
        latch = new CountDownLatch(n);
    }

    public void run() throws InterruptedException {
        final int n = (int)latch.getCount();
        final CursorRunnable[] cursors = new CursorRunnable[n];
        for (int i = 0; i < n; ++i) {
            cursors[i] = new CursorRunnable();
        }
        for (int i = 0; i < n; ++i) {
            new Thread(cursors[i]).start();
        }
        latch.await();
        for (int i = 0; i < n - 1; ++i) {
            System.out.println(cursors[i].results.equals(cursors[i + 1].results));
        }
    }

    private class CursorRunnable implements Runnable {
        private final List<DBObject> results = new ArrayList<DBObject>();

        public void run() {
            System.out.println(Thread.currentThread().getName() + " starting");
            final DBCursor cursor = oplog.find().sort(new BasicDBObject("$natural", 1)).addOption(Bytes.QUERYOPTION_TAILABLE);
            DBObject next;
            while ((next = cursor.tryNext()) != null) {
                results.add(next);
            }
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " done");
        }
    }

    public static void main( String[] args ) throws UnknownHostException, InterruptedException {
        final MongoClient client = new MongoClient("localhost", 27017);
        final DB db = client.getDB("local");
        if (!db.collectionExists("oplog.rs")) {
            throw new IllegalStateException("No oplog.rs is present");
        }
        final DBCollection oplog = db.getCollection("oplog.rs");
        new MongoCursorExample(oplog, 10).run();
    }
}
