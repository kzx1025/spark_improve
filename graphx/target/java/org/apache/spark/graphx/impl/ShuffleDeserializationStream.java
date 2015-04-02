package org.apache.spark.graphx.impl;
private abstract class ShuffleDeserializationStream extends org.apache.spark.serializer.DeserializationStream {
  public   ShuffleDeserializationStream (java.io.InputStream s) { throw new RuntimeException(); }
  public abstract <T extends java.lang.Object> T readObject (scala.reflect.ClassTag<T> evidence$12) ;
  public  int readInt () { throw new RuntimeException(); }
  public  int readUnsignedVarInt () { throw new RuntimeException(); }
  public  long readVarLong (boolean optimizePositive) { throw new RuntimeException(); }
  public  long readLong () { throw new RuntimeException(); }
  public  double readDouble () { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}
