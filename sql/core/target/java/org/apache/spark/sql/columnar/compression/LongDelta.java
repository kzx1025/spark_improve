package org.apache.spark.sql.columnar.compression;
// no position
private  class LongDelta extends org.apache.spark.sql.columnar.compression.IntegralDelta<org.apache.spark.sql.catalyst.types.LongType$> implements scala.Product, scala.Serializable {
  static public  int typeId () { throw new RuntimeException(); }
  static public  boolean supports (org.apache.spark.sql.columnar.ColumnType<?, ?> columnType) { throw new RuntimeException(); }
  static protected  long addDelta (long x, byte delta) { throw new RuntimeException(); }
  static protected  scala.Tuple2<java.lang.Object, java.lang.Object> byteSizedDelta (long x, long y) { throw new RuntimeException(); }
}
