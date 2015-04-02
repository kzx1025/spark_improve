package org.apache.spark.mllib.linalg;
/**
 * Trait for a local matrix.
 */
public abstract interface Matrix extends scala.Serializable {
  /** Number of rows. */
  public abstract  int numRows () ;
  /** Number of columns. */
  public abstract  int numCols () ;
  /** Converts to a dense array in column major. */
  public abstract  double[] toArray () ;
  /** Converts to a breeze matrix. */
  private abstract  breeze.linalg.Matrix<java.lang.Object> toBreeze () ;
  /** Gets the (i, j)-th element. */
  private  double apply (int i, int j) ;
  public  java.lang.String toString () ;
}
