package org.apache.spark.mllib.stat;
/**
 * Trait for multivariate statistical summary of a data matrix.
 */
public  interface MultivariateStatisticalSummary {
  /**
   * Sample mean vector.
   */
  public abstract  org.apache.spark.mllib.linalg.Vector mean () ;
  /**
   * Sample variance vector. Should return a zero vector if the sample size is 1.
   */
  public abstract  org.apache.spark.mllib.linalg.Vector variance () ;
  /**
   * Sample size.
   */
  public abstract  long count () ;
  /**
   * Number of nonzero elements (including explicitly presented zero values) in each column.
   */
  public abstract  org.apache.spark.mllib.linalg.Vector numNonzeros () ;
  /**
   * Maximum value of each column.
   */
  public abstract  org.apache.spark.mllib.linalg.Vector max () ;
  /**
   * Minimum value of each column.
   */
  public abstract  org.apache.spark.mllib.linalg.Vector min () ;
}
