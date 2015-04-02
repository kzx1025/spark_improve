package org.apache.spark.mllib.tree.model;
/**
 * :: DeveloperApi ::
 * Node in a decision tree
 * @param id integer node id
 * @param predict predicted value at the node
 * @param isLeaf whether the leaf is a node
 * @param split split to calculate left and right nodes
 * @param leftNode  left child
 * @param rightNode right child
 * @param stats information gain stats
 */
public  class Node implements scala.Serializable, org.apache.spark.Logging {
  public  int id () { throw new RuntimeException(); }
  public  double predict () { throw new RuntimeException(); }
  public  boolean isLeaf () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.mllib.tree.model.Split> split () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.mllib.tree.model.Node> leftNode () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.mllib.tree.model.Node> rightNode () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.mllib.tree.model.InformationGainStats> stats () { throw new RuntimeException(); }
  // not preceding
  public   Node (int id, double predict, boolean isLeaf, scala.Option<org.apache.spark.mllib.tree.model.Split> split, scala.Option<org.apache.spark.mllib.tree.model.Node> leftNode, scala.Option<org.apache.spark.mllib.tree.model.Node> rightNode, scala.Option<org.apache.spark.mllib.tree.model.InformationGainStats> stats) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * build the left node and right nodes if not leaf
   * @param nodes array of nodes
   */
  public  void build (org.apache.spark.mllib.tree.model.Node[] nodes) { throw new RuntimeException(); }
  /**
   * predict value if node is not leaf
   * @param features feature value
   * @return predicted value
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  /**
   * Get the number of nodes in tree below this node, including leaf nodes.
   * E.g., if this is a leaf, returns 0.  If both children are leaves, returns 2.
   */
  private  int numDescendants () { throw new RuntimeException(); }
  /**
   * Get depth of tree from this node.
   * E.g.: Depth 0 means this is a leaf node.
   */
  private  int subtreeDepth () { throw new RuntimeException(); }
  /**
   * Recursive print function.
   * @param indentFactor  The number of spaces to add to each level of indentation.
   */
  private  java.lang.String subtreeToString (int indentFactor) { throw new RuntimeException(); }
}
