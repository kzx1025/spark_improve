package org.apache.spark.streaming.flume;
private  class FlumeInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ReceiverInputDStream<org.apache.spark.streaming.flume.SparkFlumeEvent> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   FlumeInputDStream (org.apache.spark.streaming.StreamingContext ssc_, java.lang.String host, int port, org.apache.spark.storage.StorageLevel storageLevel, boolean enableDecompression, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<org.apache.spark.streaming.flume.SparkFlumeEvent> getReceiver () { throw new RuntimeException(); }
}