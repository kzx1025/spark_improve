package org.apache.spark.mllib.evaluation.binary;
/**
 * Trait for a binary classification evaluation metric computer.
 */
private  interface BinaryClassificationMetricComputer extends scala.Serializable {
  public abstract  double apply (org.apache.spark.mllib.evaluation.binary.BinaryConfusionMatrix c) ;
}
