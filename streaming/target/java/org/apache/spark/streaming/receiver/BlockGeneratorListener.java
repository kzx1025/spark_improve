package org.apache.spark.streaming.receiver;
/** Listener object for BlockGenerator events */
private  interface BlockGeneratorListener {
  /** Called when a new block needs to be pushed */
  public abstract  void onPushBlock (org.apache.spark.storage.StreamBlockId blockId, scala.collection.mutable.ArrayBuffer<?> arrayBuffer) ;
  /** Called when an error has occurred in BlockGenerator */
  public abstract  void onError (java.lang.String message, java.lang.Throwable throwable) ;
}
