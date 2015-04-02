package org.apache.spark.sql.types.util;
// no position
protected  class DataTypeConversions {
  /**
   * Returns the equivalent StructField in Scala for the given StructField in Java.
   */
  static public  org.apache.spark.sql.api.java.StructField asJavaStructField (org.apache.spark.sql.catalyst.types.StructField scalaStructField) { throw new RuntimeException(); }
  /**
   * Returns the equivalent DataType in Java for the given DataType in Scala.
   */
  static public  org.apache.spark.sql.api.java.DataType asJavaDataType (org.apache.spark.sql.catalyst.types.DataType scalaDataType) { throw new RuntimeException(); }
  /**
   * Returns the equivalent StructField in Scala for the given StructField in Java.
   */
  static public  org.apache.spark.sql.catalyst.types.StructField asScalaStructField (org.apache.spark.sql.api.java.StructField javaStructField) { throw new RuntimeException(); }
  /**
   * Returns the equivalent DataType in Scala for the given DataType in Java.
   */
  static public  org.apache.spark.sql.catalyst.types.DataType asScalaDataType (org.apache.spark.sql.api.java.DataType javaDataType) { throw new RuntimeException(); }
}
