# Mongo Cursor issue

```
/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/bin/java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA 14 CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/lib/tools.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Users/dsmith/dev/mongocursor/target/classes:/Users/dsmith/.m2/repository/org/mongodb/mongo-java-driver/3.0.3/mongo-java-driver-3.0.3.jar:/Applications/IntelliJ IDEA 14 CE.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain com.devinrsmith.MongoCursorExample
Aug 14, 2015 4:11:36 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
Aug 14, 2015 4:11:36 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:1, serverValue:146}] to localhost:27017
Aug 14, 2015 4:11:36 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=REPLICA_SET_PRIMARY, state=CONNECTED, ok=true, version=ServerVersion{versionList=[3, 0, 4]}, minWireVersion=0, maxWireVersion=3, electionId=55ce4fe567b2f3fdaf9ab3e3, maxDocumentSize=16777216, roundTripTimeNanos=5471672, setName='rslocal', canonicalAddress=48d9acce8ad8:27017, hosts=[48d9acce8ad8:27017], passives=[], arbiters=[], primary='48d9acce8ad8:27017', tagSet=TagSet{[]}}
Aug 14, 2015 4:11:36 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:2, serverValue:147}] to localhost:27017
Thread-1 starting
Thread-2 starting
Thread-3 starting
Thread-4 starting
Thread-5 starting
Thread-6 starting
Thread-7 starting
Thread-8 starting
Thread-9 starting
Thread-10 starting
Aug 14, 2015 4:11:36 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:3, serverValue:148}] to localhost:27017
Aug 14, 2015 4:11:36 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:4, serverValue:149}] to localhost:27017
Aug 14, 2015 4:11:36 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:6, serverValue:151}] to localhost:27017
Aug 14, 2015 4:11:36 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:5, serverValue:150}] to localhost:27017
Aug 14, 2015 4:11:37 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:7, serverValue:152}] to localhost:27017
Aug 14, 2015 4:11:37 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:9, serverValue:154}] to localhost:27017
Aug 14, 2015 4:11:37 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:10, serverValue:155}] to localhost:27017
Aug 14, 2015 4:11:37 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:8, serverValue:153}] to localhost:27017
Aug 14, 2015 4:11:37 PM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:11, serverValue:156}] to localhost:27017
Thread-7 done
Thread-6 done
2015-08-14 16:12:07
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.45-b02 mixed mode):

"Thread-10" #22 prio=5 os_prio=31 tid=0x00007f88bcac4000 nid=0x6703 runnable [0x0000000118e6a000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at com.mongodb.connection.SocketStream.read(SocketStream.java:85)
	at com.mongodb.connection.InternalStreamConnection.receiveResponseBuffers(InternalStreamConnection.java:503)
	at com.mongodb.connection.InternalStreamConnection.receiveMessage(InternalStreamConnection.java:221)
	at com.mongodb.connection.UsageTrackingInternalConnection.receiveMessage(UsageTrackingInternalConnection.java:102)
	at com.mongodb.connection.DefaultConnectionPool$PooledConnection.receiveMessage(DefaultConnectionPool.java:420)
	at com.mongodb.connection.GetMoreProtocol.receiveMessage(GetMoreProtocol.java:112)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:68)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:37)
	at com.mongodb.connection.DefaultServer$DefaultServerProtocolExecutor.execute(DefaultServer.java:155)
	at com.mongodb.connection.DefaultServerConnection.executeProtocol(DefaultServerConnection.java:219)
	at com.mongodb.connection.DefaultServerConnection.getMore(DefaultServerConnection.java:194)
	at com.mongodb.operation.QueryBatchCursor.getMore(QueryBatchCursor.java:197)
	at com.mongodb.operation.QueryBatchCursor.tryHasNext(QueryBatchCursor.java:170)
	at com.mongodb.operation.QueryBatchCursor.tryNext(QueryBatchCursor.java:154)
	at com.mongodb.MongoBatchCursorAdapter.tryNext(MongoBatchCursorAdapter.java:66)
	at com.mongodb.DBCursor.tryNext(DBCursor.java:195)
	at com.devinrsmith.MongoCursorExample$CursorRunnable.run(MongoCursorExample.java:42)
	at java.lang.Thread.run(Thread.java:745)

"Thread-9" #21 prio=5 os_prio=31 tid=0x00007f88bcac3800 nid=0x6503 runnable [0x0000000118d67000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at com.mongodb.connection.SocketStream.read(SocketStream.java:85)
	at com.mongodb.connection.InternalStreamConnection.receiveResponseBuffers(InternalStreamConnection.java:503)
	at com.mongodb.connection.InternalStreamConnection.receiveMessage(InternalStreamConnection.java:221)
	at com.mongodb.connection.UsageTrackingInternalConnection.receiveMessage(UsageTrackingInternalConnection.java:102)
	at com.mongodb.connection.DefaultConnectionPool$PooledConnection.receiveMessage(DefaultConnectionPool.java:420)
	at com.mongodb.connection.GetMoreProtocol.receiveMessage(GetMoreProtocol.java:112)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:68)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:37)
	at com.mongodb.connection.DefaultServer$DefaultServerProtocolExecutor.execute(DefaultServer.java:155)
	at com.mongodb.connection.DefaultServerConnection.executeProtocol(DefaultServerConnection.java:219)
	at com.mongodb.connection.DefaultServerConnection.getMore(DefaultServerConnection.java:194)
	at com.mongodb.operation.QueryBatchCursor.getMore(QueryBatchCursor.java:197)
	at com.mongodb.operation.QueryBatchCursor.tryHasNext(QueryBatchCursor.java:170)
	at com.mongodb.operation.QueryBatchCursor.tryNext(QueryBatchCursor.java:154)
	at com.mongodb.MongoBatchCursorAdapter.tryNext(MongoBatchCursorAdapter.java:66)
	at com.mongodb.DBCursor.tryNext(DBCursor.java:195)
	at com.devinrsmith.MongoCursorExample$CursorRunnable.run(MongoCursorExample.java:42)
	at java.lang.Thread.run(Thread.java:745)

"Thread-8" #20 prio=5 os_prio=31 tid=0x00007f88bd1f6800 nid=0x6303 runnable [0x0000000118c65000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at com.mongodb.connection.SocketStream.read(SocketStream.java:85)
	at com.mongodb.connection.InternalStreamConnection.receiveResponseBuffers(InternalStreamConnection.java:503)
	at com.mongodb.connection.InternalStreamConnection.receiveMessage(InternalStreamConnection.java:221)
	at com.mongodb.connection.UsageTrackingInternalConnection.receiveMessage(UsageTrackingInternalConnection.java:102)
	at com.mongodb.connection.DefaultConnectionPool$PooledConnection.receiveMessage(DefaultConnectionPool.java:420)
	at com.mongodb.connection.GetMoreProtocol.receiveMessage(GetMoreProtocol.java:112)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:68)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:37)
	at com.mongodb.connection.DefaultServer$DefaultServerProtocolExecutor.execute(DefaultServer.java:155)
	at com.mongodb.connection.DefaultServerConnection.executeProtocol(DefaultServerConnection.java:219)
	at com.mongodb.connection.DefaultServerConnection.getMore(DefaultServerConnection.java:194)
	at com.mongodb.operation.QueryBatchCursor.getMore(QueryBatchCursor.java:197)
	at com.mongodb.operation.QueryBatchCursor.tryHasNext(QueryBatchCursor.java:170)
	at com.mongodb.operation.QueryBatchCursor.tryNext(QueryBatchCursor.java:154)
	at com.mongodb.MongoBatchCursorAdapter.tryNext(MongoBatchCursorAdapter.java:66)
	at com.mongodb.DBCursor.tryNext(DBCursor.java:195)
	at com.devinrsmith.MongoCursorExample$CursorRunnable.run(MongoCursorExample.java:42)
	at java.lang.Thread.run(Thread.java:745)

"Thread-5" #17 prio=5 os_prio=31 tid=0x00007f88bb93f000 nid=0x5d03 runnable [0x000000011895c000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at com.mongodb.connection.SocketStream.read(SocketStream.java:85)
	at com.mongodb.connection.InternalStreamConnection.receiveResponseBuffers(InternalStreamConnection.java:503)
	at com.mongodb.connection.InternalStreamConnection.receiveMessage(InternalStreamConnection.java:221)
	at com.mongodb.connection.UsageTrackingInternalConnection.receiveMessage(UsageTrackingInternalConnection.java:102)
	at com.mongodb.connection.DefaultConnectionPool$PooledConnection.receiveMessage(DefaultConnectionPool.java:420)
	at com.mongodb.connection.GetMoreProtocol.receiveMessage(GetMoreProtocol.java:112)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:68)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:37)
	at com.mongodb.connection.DefaultServer$DefaultServerProtocolExecutor.execute(DefaultServer.java:155)
	at com.mongodb.connection.DefaultServerConnection.executeProtocol(DefaultServerConnection.java:219)
	at com.mongodb.connection.DefaultServerConnection.getMore(DefaultServerConnection.java:194)
	at com.mongodb.operation.QueryBatchCursor.getMore(QueryBatchCursor.java:197)
	at com.mongodb.operation.QueryBatchCursor.tryHasNext(QueryBatchCursor.java:170)
	at com.mongodb.operation.QueryBatchCursor.tryNext(QueryBatchCursor.java:154)
	at com.mongodb.MongoBatchCursorAdapter.tryNext(MongoBatchCursorAdapter.java:66)
	at com.mongodb.DBCursor.tryNext(DBCursor.java:195)
	at com.devinrsmith.MongoCursorExample$CursorRunnable.run(MongoCursorExample.java:42)
	at java.lang.Thread.run(Thread.java:745)

"Thread-4" #16 prio=5 os_prio=31 tid=0x00007f88bc8e2000 nid=0x5b03 runnable [0x0000000118859000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at com.mongodb.connection.SocketStream.read(SocketStream.java:85)
	at com.mongodb.connection.InternalStreamConnection.receiveResponseBuffers(InternalStreamConnection.java:503)
	at com.mongodb.connection.InternalStreamConnection.receiveMessage(InternalStreamConnection.java:221)
	at com.mongodb.connection.UsageTrackingInternalConnection.receiveMessage(UsageTrackingInternalConnection.java:102)
	at com.mongodb.connection.DefaultConnectionPool$PooledConnection.receiveMessage(DefaultConnectionPool.java:420)
	at com.mongodb.connection.GetMoreProtocol.receiveMessage(GetMoreProtocol.java:112)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:68)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:37)
	at com.mongodb.connection.DefaultServer$DefaultServerProtocolExecutor.execute(DefaultServer.java:155)
	at com.mongodb.connection.DefaultServerConnection.executeProtocol(DefaultServerConnection.java:219)
	at com.mongodb.connection.DefaultServerConnection.getMore(DefaultServerConnection.java:194)
	at com.mongodb.operation.QueryBatchCursor.getMore(QueryBatchCursor.java:197)
	at com.mongodb.operation.QueryBatchCursor.tryHasNext(QueryBatchCursor.java:170)
	at com.mongodb.operation.QueryBatchCursor.tryNext(QueryBatchCursor.java:154)
	at com.mongodb.MongoBatchCursorAdapter.tryNext(MongoBatchCursorAdapter.java:66)
	at com.mongodb.DBCursor.tryNext(DBCursor.java:195)
	at com.devinrsmith.MongoCursorExample$CursorRunnable.run(MongoCursorExample.java:42)
	at java.lang.Thread.run(Thread.java:745)

"Thread-3" #15 prio=5 os_prio=31 tid=0x00007f88bb93d800 nid=0x5903 runnable [0x0000000118756000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at com.mongodb.connection.SocketStream.read(SocketStream.java:85)
	at com.mongodb.connection.InternalStreamConnection.receiveResponseBuffers(InternalStreamConnection.java:503)
	at com.mongodb.connection.InternalStreamConnection.receiveMessage(InternalStreamConnection.java:221)
	at com.mongodb.connection.UsageTrackingInternalConnection.receiveMessage(UsageTrackingInternalConnection.java:102)
	at com.mongodb.connection.DefaultConnectionPool$PooledConnection.receiveMessage(DefaultConnectionPool.java:420)
	at com.mongodb.connection.GetMoreProtocol.receiveMessage(GetMoreProtocol.java:112)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:68)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:37)
	at com.mongodb.connection.DefaultServer$DefaultServerProtocolExecutor.execute(DefaultServer.java:155)
	at com.mongodb.connection.DefaultServerConnection.executeProtocol(DefaultServerConnection.java:219)
	at com.mongodb.connection.DefaultServerConnection.getMore(DefaultServerConnection.java:194)
	at com.mongodb.operation.QueryBatchCursor.getMore(QueryBatchCursor.java:197)
	at com.mongodb.operation.QueryBatchCursor.tryHasNext(QueryBatchCursor.java:170)
	at com.mongodb.operation.QueryBatchCursor.tryNext(QueryBatchCursor.java:154)
	at com.mongodb.MongoBatchCursorAdapter.tryNext(MongoBatchCursorAdapter.java:66)
	at com.mongodb.DBCursor.tryNext(DBCursor.java:195)
	at com.devinrsmith.MongoCursorExample$CursorRunnable.run(MongoCursorExample.java:42)
	at java.lang.Thread.run(Thread.java:745)

"Thread-2" #14 prio=5 os_prio=31 tid=0x00007f88bb93c800 nid=0x5703 runnable [0x0000000118653000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at com.mongodb.connection.SocketStream.read(SocketStream.java:85)
	at com.mongodb.connection.InternalStreamConnection.receiveResponseBuffers(InternalStreamConnection.java:503)
	at com.mongodb.connection.InternalStreamConnection.receiveMessage(InternalStreamConnection.java:221)
	at com.mongodb.connection.UsageTrackingInternalConnection.receiveMessage(UsageTrackingInternalConnection.java:102)
	at com.mongodb.connection.DefaultConnectionPool$PooledConnection.receiveMessage(DefaultConnectionPool.java:420)
	at com.mongodb.connection.GetMoreProtocol.receiveMessage(GetMoreProtocol.java:112)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:68)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:37)
	at com.mongodb.connection.DefaultServer$DefaultServerProtocolExecutor.execute(DefaultServer.java:155)
	at com.mongodb.connection.DefaultServerConnection.executeProtocol(DefaultServerConnection.java:219)
	at com.mongodb.connection.DefaultServerConnection.getMore(DefaultServerConnection.java:194)
	at com.mongodb.operation.QueryBatchCursor.getMore(QueryBatchCursor.java:197)
	at com.mongodb.operation.QueryBatchCursor.tryHasNext(QueryBatchCursor.java:170)
	at com.mongodb.operation.QueryBatchCursor.tryNext(QueryBatchCursor.java:154)
	at com.mongodb.MongoBatchCursorAdapter.tryNext(MongoBatchCursorAdapter.java:66)
	at com.mongodb.DBCursor.tryNext(DBCursor.java:195)
	at com.devinrsmith.MongoCursorExample$CursorRunnable.run(MongoCursorExample.java:42)
	at java.lang.Thread.run(Thread.java:745)

"Thread-1" #13 prio=5 os_prio=31 tid=0x00007f88bc8de800 nid=0x5503 runnable [0x0000000118550000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at com.mongodb.connection.SocketStream.read(SocketStream.java:85)
	at com.mongodb.connection.InternalStreamConnection.receiveResponseBuffers(InternalStreamConnection.java:503)
	at com.mongodb.connection.InternalStreamConnection.receiveMessage(InternalStreamConnection.java:221)
	at com.mongodb.connection.UsageTrackingInternalConnection.receiveMessage(UsageTrackingInternalConnection.java:102)
	at com.mongodb.connection.DefaultConnectionPool$PooledConnection.receiveMessage(DefaultConnectionPool.java:420)
	at com.mongodb.connection.GetMoreProtocol.receiveMessage(GetMoreProtocol.java:112)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:68)
	at com.mongodb.connection.GetMoreProtocol.execute(GetMoreProtocol.java:37)
	at com.mongodb.connection.DefaultServer$DefaultServerProtocolExecutor.execute(DefaultServer.java:155)
	at com.mongodb.connection.DefaultServerConnection.executeProtocol(DefaultServerConnection.java:219)
	at com.mongodb.connection.DefaultServerConnection.getMore(DefaultServerConnection.java:194)
	at com.mongodb.operation.QueryBatchCursor.getMore(QueryBatchCursor.java:197)
	at com.mongodb.operation.QueryBatchCursor.tryHasNext(QueryBatchCursor.java:170)
	at com.mongodb.operation.QueryBatchCursor.tryNext(QueryBatchCursor.java:154)
	at com.mongodb.MongoBatchCursorAdapter.tryNext(MongoBatchCursorAdapter.java:66)
	at com.mongodb.DBCursor.tryNext(DBCursor.java:195)
	at com.devinrsmith.MongoCursorExample$CursorRunnable.run(MongoCursorExample.java:42)
	at java.lang.Thread.run(Thread.java:745)

"pool-1-thread-1" #12 daemon prio=5 os_prio=31 tid=0x00007f88bc18b800 nid=0x5407 waiting on condition [0x00000001182c0000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007abb33910> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
	at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
	at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1067)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1127)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)

"cluster-ClusterId{value='55ce5988be3b65186b784ac5', description='null'}-localhost:27017" #11 daemon prio=5 os_prio=31 tid=0x00007f88bc9f8800 nid=0x4d03 waiting on condition [0x00000001181bd000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007abb31bb8> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
	at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
	at com.mongodb.connection.DefaultServerMonitor$ServerMonitorRunnable.waitForSignalOrTimeout(DefaultServerMonitor.java:237)
	at com.mongodb.connection.DefaultServerMonitor$ServerMonitorRunnable.waitForNext(DefaultServerMonitor.java:218)
	at com.mongodb.connection.DefaultServerMonitor$ServerMonitorRunnable.run(DefaultServerMonitor.java:167)
	- locked <0x00000007abb317e0> (a com.mongodb.connection.DefaultServerMonitor$ServerMonitorRunnable)
	at java.lang.Thread.run(Thread.java:745)

"Monitor Ctrl-Break" #9 daemon prio=5 os_prio=31 tid=0x00007f88bc053800 nid=0x4b03 runnable [0x0000000117efa000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:170)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
	at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
	at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
	- locked <0x00000007aba8a140> (a java.io.InputStreamReader)
	at java.io.InputStreamReader.read(InputStreamReader.java:184)
	at java.io.BufferedReader.fill(BufferedReader.java:161)
	at java.io.BufferedReader.readLine(BufferedReader.java:324)
	- locked <0x00000007aba8a140> (a java.io.InputStreamReader)
	at java.io.BufferedReader.readLine(BufferedReader.java:389)
	at com.intellij.rt.execution.application.AppMain$1.run(AppMain.java:93)
	at java.lang.Thread.run(Thread.java:745)

"Service Thread" #8 daemon prio=9 os_prio=31 tid=0x00007f88bd02e000 nid=0x4703 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C1 CompilerThread2" #7 daemon prio=9 os_prio=31 tid=0x00007f88bc824000 nid=0x4503 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread1" #6 daemon prio=9 os_prio=31 tid=0x00007f88bc02c000 nid=0x4303 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #5 daemon prio=9 os_prio=31 tid=0x00007f88bc81f000 nid=0x4103 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Signal Dispatcher" #4 daemon prio=9 os_prio=31 tid=0x00007f88bc81e800 nid=0x320b waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" #3 daemon prio=8 os_prio=31 tid=0x00007f88bc811000 nid=0x2d03 in Object.wait() [0x0000000115d51000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x0000000780be8e60> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
	- locked <0x0000000780be8e60> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:164)
	at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:209)

"Reference Handler" #2 daemon prio=10 os_prio=31 tid=0x00007f88bc810800 nid=0x2b03 in Object.wait() [0x0000000115c4e000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x0000000780738260> (a java.lang.ref.Reference$Lock)
	at java.lang.Object.wait(Object.java:502)
	at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:157)
	- locked <0x0000000780738260> (a java.lang.ref.Reference$Lock)

"main" #1 prio=5 os_prio=31 tid=0x00007f88bb80c000 nid=0xd03 waiting on condition [0x00000001019d4000]
   java.lang.Thread.State: WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007abb33c60> (a java.util.concurrent.CountDownLatch$Sync)
	at java.util.concurrent.locks.LockSupport.park(LockSupport.java:175)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.parkAndCheckInterrupt(AbstractQueuedSynchronizer.java:836)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.doAcquireSharedInterruptibly(AbstractQueuedSynchronizer.java:997)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1304)
	at java.util.concurrent.CountDownLatch.await(CountDownLatch.java:231)
	at com.devinrsmith.MongoCursorExample.run(MongoCursorExample.java:29)
	at com.devinrsmith.MongoCursorExample.main(MongoCursorExample.java:57)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

"VM Thread" os_prio=31 tid=0x00007f88bd027800 nid=0x2903 runnable 

"GC task thread#0 (ParallelGC)" os_prio=31 tid=0x00007f88bc805800 nid=0x2103 runnable 

"GC task thread#1 (ParallelGC)" os_prio=31 tid=0x00007f88bc00a000 nid=0x2303 runnable 

"GC task thread#2 (ParallelGC)" os_prio=31 tid=0x00007f88bc013000 nid=0x2503 runnable 

"GC task thread#3 (ParallelGC)" os_prio=31 tid=0x00007f88bd000000 nid=0x2703 runnable 

"VM Periodic Task Thread" os_prio=31 tid=0x00007f88bc01d800 nid=0x4903 waiting on condition 

JNI global references: 108

Heap
 PSYoungGen      total 18944K, used 18619K [0x00000007aab00000, 0x00000007ad000000, 0x00000007c0000000)
  eden space 16384K, 98% used [0x00000007aab00000,0x00000007abab2e90,0x00000007abb00000)
  from space 2560K, 99% used [0x00000007abb00000,0x00000007abd7c030,0x00000007abd80000)
  to   space 2560K, 0% used [0x00000007acd80000,0x00000007acd80000,0x00000007ad000000)
 ParOldGen       total 44032K, used 20416K [0x0000000780000000, 0x0000000782b00000, 0x00000007aab00000)
  object space 44032K, 46% used [0x0000000780000000,0x00000007813f0178,0x0000000782b00000)
 Metaspace       used 8623K, capacity 8726K, committed 8832K, reserved 1056768K
  class space    used 1048K, capacity 1073K, committed 1152K, reserved 1048576K
```
