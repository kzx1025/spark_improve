package org.apache.spark.mllib.tree.model;
/**
 * :: DeveloperApi ::
 * Information gain statistics for each split
 * @param gain information gain value
 * @param impurity current node impurity
 * @param leftImpurity left node impurity
 * @param rightImpurity right node impurity
 * @param predict predicted value
 * @param prob probability of the label (classification only)
 */
public  class InformationGainStats implements scala.Serializable {
  public  double gain () { throw new RuntimeException(); }
  public  double impurity () { throw new RuntimeException(); }
  public  double leftImpurity () { throw new RuntimeException(); }
  public  double rightImpurity () { throw new RuntimeException(); }
  public  double predict () { throw new RuntimeException(); }
  public  double prob () { throw new RuntimeException(); }
  // not preceding
  public   InformationGainStats (double gain, double impurity, double leftImpurity, double rightImpurity, double predict, double prob) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
