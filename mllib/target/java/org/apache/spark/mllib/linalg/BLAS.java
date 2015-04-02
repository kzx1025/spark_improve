package org.apache.spark.mllib.linalg;
// no position
/**
 * BLAS routines for MLlib's vectors and matrices.
 */
private  class BLAS implements scala.Serializable {
  static private  com.github.fommil.netlib.BLAS _f2jBLAS () { throw new RuntimeException(); }
  static private  com.github.fommil.netlib.BLAS f2jBLAS () { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  static public  void axpy (double a, org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  static private  void axpy (double a, org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  static private  void axpy (double a, org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  static public  double dot (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  static private  double dot (org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  static private  double dot (org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  static private  double dot (org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.SparseVector y) { throw new RuntimeException(); }
  /**
   * y = x
   */
  static public  void copy (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * x = a * x
   */
  static public  void scal (double a, org.apache.spark.mllib.linalg.Vector x) { throw new RuntimeException(); }
}
