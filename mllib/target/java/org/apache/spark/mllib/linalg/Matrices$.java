package org.apache.spark.mllib.linalg;
// no position
/**
 * Factory methods for {@link org.apache.spark.mllib.linalg.Matrix}.
 */
public  class Matrices$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Matrices$ MODULE$ = null;
  public   Matrices$ () { throw new RuntimeException(); }
  /**
   * Creates a column-majored dense matrix.
   * <p>
   * @param numRows number of rows
   * @param numCols number of columns
   * @param values matrix entries in column major
   */
  public  org.apache.spark.mllib.linalg.Matrix dense (int numRows, int numCols, double[] values) { throw new RuntimeException(); }
  /**
   * Creates a Matrix instance from a breeze matrix.
   * @param breeze a breeze matrix
   * @return a Matrix instance
   */
  private  org.apache.spark.mllib.linalg.Matrix fromBreeze (breeze.linalg.Matrix<java.lang.Object> breeze) { throw new RuntimeException(); }
}
