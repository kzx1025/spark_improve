package org.apache.spark.shuffle;
/**
 * Obtained inside a map task to write out records to the shuffle system.
 */
private abstract interface ShuffleWriter<K extends java.lang.Object, V extends java.lang.Object> {
  public  boolean isRDDCache () ;
  public  void setRDDCache (boolean isRDDCache) ;
  public  boolean getRDDCaChe () ;
  /** Write a bunch of records to this task's output */
  public abstract  void write (scala.collection.Iterator<scala.Product2<K, V>> records) ;
  /** Close this writer, passing along whether the map completed */
  public abstract  scala.Option<org.apache.spark.scheduler.MapStatus> stop (boolean success) ;
}
