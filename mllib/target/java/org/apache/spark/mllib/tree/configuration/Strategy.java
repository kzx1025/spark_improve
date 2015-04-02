package org.apache.spark.mllib.tree.configuration;
/**
 * :: Experimental ::
 * Stores all the configuration options for tree construction
 * @param algo  Learning goal.  Supported:
 *              {@link org.apache.spark.mllib.tree.configuration.Algo.Classification},
 *              {@link org.apache.spark.mllib.tree.configuration.Algo.Regression}
 * @param impurity Criterion used for information gain calculation.
 *                 Supported for Classification: {@link org.apache.spark.mllib.tree.impurity.Gini},
 *                  {@link org.apache.spark.mllib.tree.impurity.Entropy}.
 *                 Supported for Regression: {@link org.apache.spark.mllib.tree.impurity.Variance}.
 * @param maxDepth Maximum depth of the tree.
 *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
 * @param numClassesForClassification Number of classes for classification.
 *                                    (Ignored for regression.)
 *                                    Default value is 2 (binary classification).
 * @param maxBins Maximum number of bins used for discretizing continuous features and
 *                for choosing how to split on features at each node.
 *                More bins give higher granularity.
 * @param quantileCalculationStrategy Algorithm for calculating quantiles.  Supported:
 *                             {@link org.apache.spark.mllib.tree.configuration.QuantileStrategy.Sort}
 * @param categoricalFeaturesInfo A map storing information about the categorical variables and the
 *                                number of discrete values they take. For example, an entry (n ->
 *                                k) implies the feature n is categorical with k categories 0,
 *                                1, 2, ... , k-1. It's important to note that features are
 *                                zero-indexed.
 * @param maxMemoryInMB Maximum memory in MB allocated to histogram aggregation. Default value is
 *                      128 MB.
 */
public  class Strategy implements scala.Serializable {
  public  scala.Enumeration.Value algo () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.Impurity impurity () { throw new RuntimeException(); }
  public  int maxDepth () { throw new RuntimeException(); }
  public  int numClassesForClassification () { throw new RuntimeException(); }
  public  int maxBins () { throw new RuntimeException(); }
  public  scala.Enumeration.Value quantileCalculationStrategy () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo () { throw new RuntimeException(); }
  public  int maxMemoryInMB () { throw new RuntimeException(); }
  // not preceding
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClassesForClassification, int maxBins, scala.Enumeration.Value quantileCalculationStrategy, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int maxMemoryInMB) { throw new RuntimeException(); }
  public  boolean isMulticlassClassification () { throw new RuntimeException(); }
  public  boolean isMulticlassWithCategoricalFeatures () { throw new RuntimeException(); }
  /**
   * Java-friendly constructor for {@link org.apache.spark.mllib.tree.configuration.Strategy}
   */
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClassesForClassification, int maxBins, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo) { throw new RuntimeException(); }
  /**
   * Check validity of parameters.
   * Throws exception if invalid.
   */
  private  void assertValid () { throw new RuntimeException(); }
}
