package org.apache.spark.streaming.util;
/**
 * This is a output stream just for testing. All the output is collected into a
 * ArrayBuffer. This buffer is wiped clean on being restored from checkpoint.
 */
private  class TestOutputStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ForEachDStream<T> {
  public  scala.collection.mutable.ArrayBuffer<scala.collection.Seq<T>> output () { throw new RuntimeException(); }
  // not preceding
  public   TestOutputStream (org.apache.spark.streaming.dstream.DStream<T> parent, scala.collection.mutable.ArrayBuffer<scala.collection.Seq<T>> output, scala.reflect.ClassTag<T> evidence$5) { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream ois) { throw new RuntimeException(); }
}
