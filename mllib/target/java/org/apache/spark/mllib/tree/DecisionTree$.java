package org.apache.spark.mllib.tree;
// no position
public  class DecisionTree$ implements scala.Serializable, org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTree$ MODULE$ = null;
  public   DecisionTree$ () { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * Note: Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   *       and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   *       is recommended to clearly separate classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param strategy The configuration parameters for the tree algorithm which specify the type
   *                 of algorithm (classification, regression, etc.), feature type (continuous,
   *                 categorical), depth of the tree, quantile calculation strategy, etc.
   * @return DecisionTreeModel that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * Note: Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   *       and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   *       is recommended to clearly separate classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo algorithm, classification or regression
   * @param impurity impurity criterion used for information gain calculation
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   * @return DecisionTreeModel that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * Note: Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   *       and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   *       is recommended to clearly separate classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo algorithm, classification or regression
   * @param impurity impurity criterion used for information gain calculation
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   * @param numClassesForClassification number of classes for classification. Default value of 2.
   * @return DecisionTreeModel that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClassesForClassification) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * Note: Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   *       and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   *       is recommended to clearly separate classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo classification or regression
   * @param impurity criterion used for information gain calculation
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   * @param numClassesForClassification number of classes for classification. Default value of 2.
   * @param maxBins maximum number of bins used for splitting features
   * @param quantileCalculationStrategy  algorithm for calculating quantiles
   * @param categoricalFeaturesInfo Map storing arity of categorical features.
   *                                E.g., an entry (n -> k) indicates that feature n is categorical
   *                                with k categories indexed from 0: {0, 1, ..., k-1}.
   * @return DecisionTreeModel that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClassesForClassification, int maxBins, scala.Enumeration.Value quantileCalculationStrategy, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for binary or multiclass classification.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels should take values {0, 1, ..., numClasses-1}.
   * @param numClassesForClassification number of classes for classification.
   * @param categoricalFeaturesInfo Map storing arity of categorical features.
   *                                E.g., an entry (n -> k) indicates that feature n is categorical
   *                                with k categories indexed from 0: {0, 1, ..., k-1}.
   * @param impurity Criterion used for information gain calculation.
   *                 Supported values: "gini" (recommended) or "entropy".
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   *                  (suggested value: 4)
   * @param maxBins maximum number of bins used for splitting features
   *                 (suggested value: 100)
   * @return DecisionTreeModel that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainClassifier (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClassesForClassification, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins) { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainClassifier (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClassesForClassification, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels are real numbers.
   * @param categoricalFeaturesInfo Map storing arity of categorical features.
   *                                E.g., an entry (n -> k) indicates that feature n is categorical
   *                                with k categories indexed from 0: {0, 1, ..., k-1}.
   * @param impurity Criterion used for information gain calculation.
   *                 Supported values: "variance".
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   *                  (suggested value: 4)
   * @param maxBins maximum number of bins used for splitting features
   *                 (suggested value: 100)
   * @return DecisionTreeModel that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainRegressor (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins) { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainRegressor (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins) { throw new RuntimeException(); }
  private  int InvalidBinIndex () { throw new RuntimeException(); }
  /**
   * Returns an array of optimal splits for all nodes at a given level. Splits the task into
   * multiple groups if the level-wise training task could lead to memory overflow.
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.tree.impl.TreePoint}
   * @param parentImpurities Impurities for all parent nodes for the current level
   * @param metadata Learning and dataset metadata
   * @param level Level of the tree
   * @param splits possible splits for all features
   * @param bins possible bins for all features
   * @param maxLevelForSingleGroup the deepest level for single-group level-wise computation.
   * @return array (over nodes) of splits with best split for each node at a given level.
   */
  protected  scala.Tuple2<org.apache.spark.mllib.tree.model.Split, org.apache.spark.mllib.tree.model.InformationGainStats>[] findBestSplits (org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.impl.TreePoint> input, double[] parentImpurities, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, int level, org.apache.spark.mllib.tree.model.Node[] nodes, org.apache.spark.mllib.tree.model.Split[][] splits, org.apache.spark.mllib.tree.model.Bin[][] bins, int maxLevelForSingleGroup, org.apache.spark.mllib.tree.impl.TimeTracker timer) { throw new RuntimeException(); }
  /**
   * Returns an array of optimal splits for a group of nodes at a given level
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.tree.impl.TreePoint}
   * @param parentImpurities Impurities for all parent nodes for the current level
   * @param metadata Learning and dataset metadata
   * @param level Level of the tree
   * @param splits possible splits for all features
   * @param bins possible bins for all features, indexed as (numFeatures)(numBins)
   * @param numGroups total number of node groups at the current level. Default value is set to 1.
   * @param groupIndex index of the node group being processed. Default value is set to 0.
   * @return array of splits with best splits for all nodes at a given level.
   */
  private  scala.Tuple2<org.apache.spark.mllib.tree.model.Split, org.apache.spark.mllib.tree.model.InformationGainStats>[] findBestSplitsPerGroup (org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.impl.TreePoint> input, double[] parentImpurities, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, int level, org.apache.spark.mllib.tree.model.Node[] nodes, org.apache.spark.mllib.tree.model.Split[][] splits, org.apache.spark.mllib.tree.model.Bin[][] bins, org.apache.spark.mllib.tree.impl.TimeTracker timer, int numGroups, int groupIndex) { throw new RuntimeException(); }
  /**
   * Get the number of values to be stored per node in the bin aggregates.
   * <p>
   * @param numBins  Number of bins = 1 + number of possible splits.
   */
  private  int getElementsPerNode (org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, int numBins) { throw new RuntimeException(); }
  /**
   * Returns splits and bins for decision tree calculation.
   * Continuous and categorical features are handled differently.
   * <p>
   * Continuous features:
   *   For each feature, there are numBins - 1 possible splits representing the possible binary
   *   decisions at each node in the tree.
   * <p>
   * Categorical features:
   *   For each feature, there is 1 bin per split.
   *   Splits and bins are handled in 2 ways:
   *   (a) "unordered features"
   *       For multiclass classification with a low-arity feature
   *       (i.e., if isMulticlass && isSpaceSufficientForAllCategoricalSplits),
   *       the feature is split based on subsets of categories.
   *       There are (1 << maxFeatureValue - 1) - 1 splits.
   *   (b) "ordered features"
   *       For regression and binary classification,
   *       and for multiclass classification with a high-arity feature,
   *       there is one bin per category.
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}
   * @param metadata Learning and dataset metadata
   * @return A tuple of (splits, bins).
   *         Splits is an Array of {@link org.apache.spark.mllib.tree.model.Split}
   *          of size (numFeatures, numBins - 1).
   *         Bins is an Array of {@link org.apache.spark.mllib.tree.model.Bin}
   *          of size (numFeatures, numBins).
   */
  protected  scala.Tuple2<org.apache.spark.mllib.tree.model.Split[][], org.apache.spark.mllib.tree.model.Bin[][]> findSplitsBins (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata) { throw new RuntimeException(); }
  /**
   * Nested method to extract list of eligible categories given an index. It extracts the
   * position of ones in a binary representation of the input. If binary
   * representation of an number is 01101 (13), the output list should (3.0, 2.0,
   * 0.0). The maxFeatureValue depict the number of rightmost digits that will be tested for ones.
   */
  private  scala.collection.immutable.List<java.lang.Object> extractMultiClassCategories (int input, int maxFeatureValue) { throw new RuntimeException(); }
}
