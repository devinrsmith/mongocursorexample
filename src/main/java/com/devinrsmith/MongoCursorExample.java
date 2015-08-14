package com.devinrsmith;


import com.mongodb.*;

import java.net.UnknownHostException;
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
            System.out.println(cursors[i].count == cursors[i + 1].count);
        }
    }

    private class CursorRunnable implements Runnable {
        private int count;

        public void run() {
            System.out.println(Thread.currentThread().getName() + " starting");
            try {
                final DBCursor cursor = oplog.find().sort(new BasicDBObject("$natural", 1)).addOption(Bytes.QUERYOPTION_TAILABLE);
                DBObject next;
                while ((next = cursor.tryNext()) != null) {
                    ++count;
                }
                latch.countDown();
                System.out.println(Thread.currentThread().getName() + " latchDown");
                cursor.close();
            } catch (MongoException e) {
                System.err.println("Mongo exception " + e);
                System.exit(1);
            } finally {
                System.out.println(Thread.currentThread().getName() + " done");
            }
        }
    }

    public static void main( String[] args ) throws UnknownHostException, InterruptedException {
        final MongoClient client = new MongoClient("localhost", 27017);
        final DB db = client.getDB("local");
        if (!db.collectionExists("oplog.rs")) {
            throw new IllegalStateException("No oplog.rs is present");
        }
        final DBCollection oplog = db.getCollection("oplog.rs");
        final int[] index = new int[1];
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    final int startIndex = index[0];
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                    if (startIndex == index[0]) {
                        System.out.println("Maybe blocked");
                    }
                }
            }
        }).start();

        for (int i = 0; i < 100; ++i) {
            index[0] = i;
            new MongoCursorExample(oplog, 10).run();
        }
    }
}
