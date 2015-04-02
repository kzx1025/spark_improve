package org.apache.spark.mllib.tree.impl;
// no position
private  class TreePoint$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TreePoint$ MODULE$ = null;
  public   TreePoint$ () { throw new RuntimeException(); }
  /**
   * Convert an input dataset into its TreePoint representation,
   * binning feature values in preparation for DecisionTree training.
   * @param input     Input dataset.
   * @param bins      Bins for features, of size (numFeatures, numBins).
   * @param metadata Learning and dataset metadata
   * @return  TreePoint dataset representation
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.impl.TreePoint> convertToTreeRDD (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.model.Bin[][] bins, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata) { throw new RuntimeException(); }
  /**
   * Convert one LabeledPoint into its TreePoint representation.
   * @param bins      Bins for features, of size (numFeatures, numBins).
   */
  private  org.apache.spark.mllib.tree.impl.TreePoint labeledPointToTreePoint (org.apache.spark.mllib.regression.LabeledPoint labeledPoint, org.apache.spark.mllib.tree.model.Bin[][] bins, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata) { throw new RuntimeException(); }
  /**
   * Find bin for one (labeledPoint, feature).
   * <p>
   * @param isUnorderedFeature  (only applies if feature is categorical)
   * @param bins   Bins for features, of size (numFeatures, numBins).
   * @param categoricalFeaturesInfo  Map over categorical features: feature index --> feature arity
   */
  private  int findBin (int featureIndex, org.apache.spark.mllib.regression.LabeledPoint labeledPoint, boolean isFeatureContinuous, boolean isUnorderedFeature, org.apache.spark.mllib.tree.model.Bin[][] bins, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo) { throw new RuntimeException(); }
}
