package org.apache.spark.mllib.linalg;
// no position
/**
 * BLAS routines for MLlib's vectors and matrices.
 */
private  class BLAS$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BLAS$ MODULE$ = null;
  public   BLAS$ () { throw new RuntimeException(); }
  private  com.github.fommil.netlib.BLAS _f2jBLAS () { throw new RuntimeException(); }
  private  com.github.fommil.netlib.BLAS f2jBLAS () { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  public  void axpy (double a, org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  private  void axpy (double a, org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  private  void axpy (double a, org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  public  double dot (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  private  double dot (org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  private  double dot (org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  private  double dot (org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.SparseVector y) { throw new RuntimeException(); }
  /**
   * y = x
   */
  public  void copy (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * x = a * x
   */
  public  void scal (double a, org.apache.spark.mllib.linalg.Vector x) { throw new RuntimeException(); }
}
