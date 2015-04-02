package org.apache.spark.graphx.impl;
private abstract interface ShuffleSerializerInstance {
  public <T extends java.lang.Object> java.nio.ByteBuffer serialize (T t, scala.reflect.ClassTag<T> evidence$13) ;
  public <T extends java.lang.Object> T deserialize (java.nio.ByteBuffer bytes, scala.reflect.ClassTag<T> evidence$14) ;
  public <T extends java.lang.Object> T deserialize (java.nio.ByteBuffer bytes, java.lang.ClassLoader loader, scala.reflect.ClassTag<T> evidence$15) ;
  public abstract  org.apache.spark.serializer.SerializationStream serializeStream (java.io.OutputStream s) ;
  public abstract  org.apache.spark.serializer.DeserializationStream deserializeStream (java.io.InputStream s) ;
}
