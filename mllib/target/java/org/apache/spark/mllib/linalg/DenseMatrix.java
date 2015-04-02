package org.apache.spark.mllib.linalg;
/**
 * Column-majored dense matrix.
 * The entry values are stored in a single array of doubles with columns listed in sequence.
 * For example, the following matrix
 * <pre><code>
 *   1.0 2.0
 *   3.0 4.0
 *   5.0 6.0
 * </code></pre>
 * is stored as <code>[1.0, 3.0, 5.0, 2.0, 4.0, 6.0]</code>.
 * <p>
 * @param numRows number of rows
 * @param numCols number of columns
 * @param values matrix entries in column major
 */
public  class DenseMatrix implements org.apache.spark.mllib.linalg.Matrix {
  public  int numRows () { throw new RuntimeException(); }
  public  int numCols () { throw new RuntimeException(); }
  public  double[] values () { throw new RuntimeException(); }
  // not preceding
  public   DenseMatrix (int numRows, int numCols, double[] values) { throw new RuntimeException(); }
  public  double[] toArray () { throw new RuntimeException(); }
  private  breeze.linalg.Matrix<java.lang.Object> toBreeze () { throw new RuntimeException(); }
}
