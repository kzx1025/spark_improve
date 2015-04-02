package org.apache.spark.mllib.tree.impl;
/**
 * Learning and dataset metadata for DecisionTree.
 * <p>
 * @param numClasses    For classification: labels can take values {0, ..., numClasses - 1}.
 *                      For regression: fixed at 0 (no meaning).
 * @param featureArity  Map: categorical feature index --> arity.
 *                      I.e., the feature takes values in {0, ..., arity - 1}.
 */
private  class DecisionTreeMetadata implements scala.Serializable {
  static public  org.apache.spark.mllib.tree.impl.DecisionTreeMetadata buildMetadata (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy) { throw new RuntimeException(); }
  public  int numFeatures () { throw new RuntimeException(); }
  public  long numExamples () { throw new RuntimeException(); }
  public  int numClasses () { throw new RuntimeException(); }
  public  int maxBins () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> featureArity () { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> unorderedFeatures () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.Impurity impurity () { throw new RuntimeException(); }
  public  scala.Enumeration.Value quantileStrategy () { throw new RuntimeException(); }
  // not preceding
  public   DecisionTreeMetadata (int numFeatures, long numExamples, int numClasses, int maxBins, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> featureArity, scala.collection.immutable.Set<java.lang.Object> unorderedFeatures, org.apache.spark.mllib.tree.impurity.Impurity impurity, scala.Enumeration.Value quantileStrategy) { throw new RuntimeException(); }
  public  boolean isUnordered (int featureIndex) { throw new RuntimeException(); }
  public  boolean isClassification () { throw new RuntimeException(); }
  public  boolean isMulticlass () { throw new RuntimeException(); }
  public  boolean isMulticlassWithCategoricalFeatures () { throw new RuntimeException(); }
  public  boolean isCategorical (int featureIndex) { throw new RuntimeException(); }
  public  boolean isContinuous (int featureIndex) { throw new RuntimeException(); }
}
