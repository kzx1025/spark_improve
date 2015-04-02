package org.apache.spark.mllib.api.python;
// no position
/**
 * SerDe utility functions for PythonMLLibAPI.
 */
private  class SerDe implements scala.Serializable {
  static private  byte DENSE_VECTOR_MAGIC () { throw new RuntimeException(); }
  static private  byte SPARSE_VECTOR_MAGIC () { throw new RuntimeException(); }
  static private  byte DENSE_MATRIX_MAGIC () { throw new RuntimeException(); }
  static private  byte LABELED_POINT_MAGIC () { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.linalg.Vector deserializeDoubleVector (byte[] bytes, int offset) { throw new RuntimeException(); }
  static private  double deserializeDouble (byte[] bytes, int offset) { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.linalg.Vector deserializeDenseVector (byte[] bytes, int offset) { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.linalg.Vector deserializeSparseVector (byte[] bytes, int offset) { throw new RuntimeException(); }
  /**
   * Returns an 8-byte array for the input Double.
   * <p>
   * Note: we currently do not use a magic byte for double for storage efficiency.
   * This should be reconsidered when we add Ser/De for other 8-byte types (e.g. Long), for safety.
   * The corresponding deserializer, deserializeDouble, needs to be modified as well if the
   * serialization scheme changes.
   */
  static private  byte[] serializeDouble (double double) { throw new RuntimeException(); }
  static private  byte[] serializeDenseVector (double[] doubles) { throw new RuntimeException(); }
  static private  byte[] serializeSparseVector (org.apache.spark.mllib.linalg.SparseVector vector) { throw new RuntimeException(); }
  static private  byte[] serializeDoubleVector (org.apache.spark.mllib.linalg.Vector vector) { throw new RuntimeException(); }
  static private  double[][] deserializeDoubleMatrix (byte[] bytes) { throw new RuntimeException(); }
  static private  byte[] serializeDoubleMatrix (double[][] doubles) { throw new RuntimeException(); }
  static private  byte[] serializeLabeledPoint (org.apache.spark.mllib.regression.LabeledPoint p) { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.regression.LabeledPoint deserializeLabeledPoint (byte[] bytes) { throw new RuntimeException(); }
  static private  double[][] to2dArray (org.apache.spark.mllib.linalg.Matrix matrix) { throw new RuntimeException(); }
  /** Unpack a Rating object from an array of bytes */
  static private  org.apache.spark.mllib.recommendation.Rating unpackRating (byte[] ratingBytes) { throw new RuntimeException(); }
  /** Unpack a tuple of Ints from an array of bytes */
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> unpackTuple (byte[] tupleBytes) { throw new RuntimeException(); }
  /**
   * Serialize a Rating object into an array of bytes.
   * It can be deserialized using RatingDeserializer().
   * <p>
   * @param rate the Rating object to serialize
   * @return
   */
  static public  byte[] serializeRating (org.apache.spark.mllib.recommendation.Rating rate) { throw new RuntimeException(); }
}
