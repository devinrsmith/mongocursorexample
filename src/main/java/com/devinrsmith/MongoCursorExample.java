package com.devinrsmith;


import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Collections;
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
        boolean allSame = true;
        for (int i = 0; i < n - 1; ++i) {
            if (cursors[i].count != cursors[i + 1].count) {
                allSame = false;
                break;
            }
        }
        System.out.println(allSame);
    }

    private class CursorRunnable implements Runnable {
        private int count;

        public void run() {
            //System.out.println(Thread.currentThread().getName() + " starting");
            try {
                final DBCursor cursor = oplog.find().sort(new BasicDBObject("$natural", 1)).addOption(Bytes.QUERYOPTION_TAILABLE);
                DBObject next;
                while ((next = cursor.tryNext()) != null) {
                    ++count;
                }
                latch.countDown();
                //System.out.println(Thread.currentThread().getName() + " latchDown");
                cursor.close();
            } catch (MongoException e) {
                System.err.println("Mongo exception " + e);
                System.exit(1);
            } finally {
                //System.out.println(Thread.currentThread().getName() + " done");
            }
        }
    }

    public static void main( String[] args ) throws UnknownHostException, InterruptedException {
        final MongoClient client = new MongoClient(args[0], 27017);

        final DB db = client.getDB("local");

        if (!db.collectionExists("oplog.rs")) {
            throw new IllegalStateException("No oplog.rs is present");
        }
        final DBCollection oplog = db.getCollection("oplog.rs");
        for (int i = 0; i < 100; ++i) {
            System.out.println("Starting run " + i + " with " + (i + 1) + " cursors");
            final long startTime = System.currentTimeMillis();
            new MongoCursorExample(oplog, i + 1).run();
            final long stopTime = System.currentTimeMillis();
            System.out.println("Done with run " + i + ": " + (stopTime - startTime) + " millis");
        }
    }
}
