package org.apache.spark.mllib.evaluation.binary;
/**
 * Trait for a binary confusion matrix.
 */
private abstract interface BinaryConfusionMatrix {
  /** number of true positives */
  public abstract  long numTruePositives () ;
  /** number of false positives */
  public abstract  long numFalsePositives () ;
  /** number of false negatives */
  public abstract  long numFalseNegatives () ;
  /** number of true negatives */
  public abstract  long numTrueNegatives () ;
  /** number of positives */
  public  long numPositives () ;
  /** number of negatives */
  public  long numNegatives () ;
}
