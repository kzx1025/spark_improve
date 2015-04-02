package org.apache.spark.streaming.scheduler;
/**
 * This class manages the execution of the receivers of NetworkInputDStreams. Instance of
 * this class must be created after all input streams have been added and StreamingContext.start()
 * has been called because it needs the final set of input streams at the time of instantiation.
 */
private  class ReceiverTracker implements org.apache.spark.Logging {
  public   ReceiverTracker (org.apache.spark.streaming.StreamingContext ssc) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<?>[] receiverInputStreams () { throw new RuntimeException(); }
  public  Object receiverInputStreamMap () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.ReceiverTracker.ReceiverLauncher receiverExecutor () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.streaming.scheduler.ReceiverInfo> receiverInfo () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.SynchronizedQueue<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> receivedBlockInfo () { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration timeout () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.StreamingListenerBus listenerBus () { throw new RuntimeException(); }
  public  akka.actor.ActorRef actor () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time currentTime () { throw new RuntimeException(); }
  /** Start the actor and receiver execution thread. */
  public  void start () { throw new RuntimeException(); }
  /** Stop the receiver execution thread. */
  public  void stop () { throw new RuntimeException(); }
  /** Return all the blocks received from a receiver. */
  public  org.apache.spark.streaming.scheduler.ReceivedBlockInfo[] getReceivedBlockInfo (int streamId) { throw new RuntimeException(); }
  private  scala.collection.mutable.SynchronizedQueue<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> getReceivedBlockInfoQueue (int streamId) { throw new RuntimeException(); }
  /** Register a receiver */
  public  void registerReceiver (int streamId, java.lang.String typ, java.lang.String host, akka.actor.ActorRef receiverActor, akka.actor.ActorRef sender) { throw new RuntimeException(); }
  /** Deregister a receiver */
  public  void deregisterReceiver (int streamId, java.lang.String message, java.lang.String error) { throw new RuntimeException(); }
  /** Add new blocks for the given stream */
  public  void addBlocks (org.apache.spark.streaming.scheduler.ReceivedBlockInfo receivedBlockInfo) { throw new RuntimeException(); }
  /** Report error sent by a receiver */
  public  void reportError (int streamId, java.lang.String message, java.lang.String error) { throw new RuntimeException(); }
  /** Check if any blocks are left to be processed */
  public  boolean hasMoreReceivedBlockIds () { throw new RuntimeException(); }
  /** Actor to receive messages from the receivers. */
  private  class ReceiverTrackerActor implements akka.actor.Actor {
    public   ReceiverTrackerActor () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  }
  /** This thread class runs all the receivers on the cluster.  */
  public  class ReceiverLauncher {
    public   ReceiverLauncher () { throw new RuntimeException(); }
    public  org.apache.spark.SparkEnv env () { throw new RuntimeException(); }
    public  java.lang.Thread thread () { throw new RuntimeException(); }
    public  void start () { throw new RuntimeException(); }
    public  void stop () { throw new RuntimeException(); }
    /**
     * Get the receivers from the ReceiverInputDStreams, distributes them to the
     * worker nodes as a parallel collection, and runs them.
     */
    private  void startReceivers () { throw new RuntimeException(); }
    /** Stops the receivers. */
    private  void stopReceivers () { throw new RuntimeException(); }
  }
}
