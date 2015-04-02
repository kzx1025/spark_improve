package org.apache.spark.mllib.linalg;
// no position
// not preceding
public  class Vectors$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Vectors$ MODULE$ = null;
  /**
   * Creates a dense vector from its values.
   */
  public  org.apache.spark.mllib.linalg.Vector dense (double firstValue, double... otherValues) { throw new RuntimeException(); }
  public   Vectors$ () { throw new RuntimeException(); }
  /**
   * Creates a dense vector from its values.
   */
  public  org.apache.spark.mllib.linalg.Vector dense (double firstValue, scala.collection.Seq<java.lang.Object> otherValues) { throw new RuntimeException(); }
  /**
   * Creates a dense vector from a double array.
   */
  public  org.apache.spark.mllib.linalg.Vector dense (double[] values) { throw new RuntimeException(); }
  /**
   * Creates a sparse vector providing its index array and value array.
   * <p>
   * @param size vector size.
   * @param indices index array, must be strictly increasing.
   * @param values value array, must have the same length as indices.
   */
  public  org.apache.spark.mllib.linalg.Vector sparse (int size, int[] indices, double[] values) { throw new RuntimeException(); }
  /**
   * Creates a sparse vector using unordered (index, value) pairs.
   * <p>
   * @param size vector size.
   * @param elements vector elements in (index, value) pairs.
   */
  public  org.apache.spark.mllib.linalg.Vector sparse (int size, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> elements) { throw new RuntimeException(); }
  /**
   * Creates a sparse vector using unordered (index, value) pairs in a Java friendly way.
   * <p>
   * @param size vector size.
   * @param elements vector elements in (index, value) pairs.
   */
  public  org.apache.spark.mllib.linalg.Vector sparse (int size, java.lang.Iterable<scala.Tuple2<java.lang.Integer, java.lang.Double>> elements) { throw new RuntimeException(); }
  /**
   * Creates a dense vector of all zeros.
   * <p>
   * @param size vector size
   * @return a zero vector
   */
  public  org.apache.spark.mllib.linalg.Vector zeros (int size) { throw new RuntimeException(); }
  /**
   * Parses a string resulted from <code>Vector#toString</code> into
   * an {@link org.apache.spark.mllib.linalg.Vector}.
   */
  public  org.apache.spark.mllib.linalg.Vector parse (java.lang.String s) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.Vector parseNumeric (Object any) { throw new RuntimeException(); }
  /**
   * Creates a vector instance from a breeze vector.
   */
  private  org.apache.spark.mllib.linalg.Vector fromBreeze (breeze.linalg.Vector<java.lang.Object> breezeVector) { throw new RuntimeException(); }
}
