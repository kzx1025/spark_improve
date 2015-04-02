package org.apache.spark.graphx.impl;
private abstract class ShuffleSerializationStream extends org.apache.spark.serializer.SerializationStream {
  public   ShuffleSerializationStream (java.io.OutputStream s) { throw new RuntimeException(); }
  public abstract <T extends java.lang.Object> org.apache.spark.serializer.SerializationStream writeObject (T t, scala.reflect.ClassTag<T> evidence$11) ;
  public  void writeInt (int v) { throw new RuntimeException(); }
  public  void writeUnsignedVarInt (int value) { throw new RuntimeException(); }
  public  void writeVarLong (long value, boolean optimizePositive) { throw new RuntimeException(); }
  public  void writeLong (long v) { throw new RuntimeException(); }
  public  void writeDouble (double v) { throw new RuntimeException(); }
  public  void flush () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}
