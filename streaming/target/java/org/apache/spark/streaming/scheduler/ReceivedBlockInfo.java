package org.apache.spark.streaming.scheduler;
/** Information about blocks received by the receiver */
private  class ReceivedBlockInfo implements scala.Product, scala.Serializable {
  public  int streamId () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StreamBlockId blockId () { throw new RuntimeException(); }
  public  long numRecords () { throw new RuntimeException(); }
  public  Object metadata () { throw new RuntimeException(); }
  // not preceding
  public   ReceivedBlockInfo (int streamId, org.apache.spark.storage.StreamBlockId blockId, long numRecords, Object metadata) { throw new RuntimeException(); }
}
