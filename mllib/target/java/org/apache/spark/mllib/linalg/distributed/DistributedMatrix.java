package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents a distributively stored matrix backed by one or more RDDs.
 */
public  interface DistributedMatrix extends scala.Serializable {
  /** Gets or computes the number of rows. */
  public abstract  long numRows () ;
  /** Gets or computes the number of columns. */
  public abstract  long numCols () ;
  /** Collects data and assembles a local dense breeze matrix (for test only). */
  private abstract  breeze.linalg.DenseMatrix<java.lang.Object> toBreeze () ;
}
