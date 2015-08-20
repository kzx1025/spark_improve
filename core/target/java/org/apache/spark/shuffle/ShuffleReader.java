package org.apache.spark.shuffle;
/**
 * Obtained inside a reduce task to read combined records from the mappers.
 */
private abstract interface ShuffleReader<K extends java.lang.Object, C extends java.lang.Object> {
  /** Read the combined key-values for this reduce task */
  public  org.apache.spark.scheduler.ShuffleMemorySignal shuffleMemorySignal () ;
  public  void setShuffleMemorySignal (org.apache.spark.scheduler.ShuffleMemorySignal shuffleMemorySignal) ;
  public  org.apache.spark.scheduler.ShuffleMemorySignal getShuffleMemorySignal () ;
  public abstract  scala.collection.Iterator<scala.Product2<K, C>> read () ;
  /** Close this reader */
  public abstract  void stop () ;
}
