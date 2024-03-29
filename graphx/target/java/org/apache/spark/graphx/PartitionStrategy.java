package org.apache.spark.graphx;
/**
 * Represents the way edges are assigned to edge partitions based on their source and destination
 * vertex IDs.
 */
public  interface PartitionStrategy extends scala.Serializable {
  // no position
  /**
   * Assigns edges to partitions using a 2D partitioning of the sparse edge adjacency matrix,
   * guaranteeing a <code>2 * sqrt(numParts)</code> bound on vertex replication.
   * <p>
   * Suppose we have a graph with 11 vertices that we want to partition
   * over 9 machines.  We can use the following sparse matrix representation:
   * <p>
   * <pre>
   *       __________________________________
   *  v0   | P0 *     | P1       | P2    *  |
   *  v1   |  ****    |  *       |          |
   *  v2   |  ******* |      **  |  ****    |
   *  v3   |  *****   |  *  *    |       *  |
   *       ----------------------------------
   *  v4   | P3 *     | P4 ***   | P5 **  * |
   *  v5   |  *  *    |  *       |          |
   *  v6   |       *  |      **  |  ****    |
   *  v7   |  * * *   |  *  *    |       *  |
   *       ----------------------------------
   *  v8   | P6   *   | P7    *  | P8  *   *|
   *  v9   |     *    |  *    *  |          |
   *  v10  |       *  |      **  |  *  *    |
   *  v11  | * &lt;-E    |  ***     |       ** |
   *       ----------------------------------
   * </pre>
   * <p>
   * The edge denoted by <code>E</code> connects <code>v11</code> with <code>v1</code> and is assigned to processor <code>P6</code>. To get the
   * processor number we divide the matrix into <code>sqrt(numParts)</code> by <code>sqrt(numParts)</code> blocks. Notice
   * that edges adjacent to <code>v11</code> can only be in the first column of blocks <code>(P0, P3,
   * P6)</code> or the last
   * row of blocks <code>(P6, P7, P8)</code>.  As a consequence we can guarantee that <code>v11</code> will need to be
   * replicated to at most <code>2 * sqrt(numParts)</code> machines.
   * <p>
   * Notice that <code>P0</code> has many edges and as a consequence this partitioning would lead to poor work
   * balance.  To improve balance we first multiply each vertex id by a large prime to shuffle the
   * vertex locations.
   * <p>
   * One of the limitations of this approach is that the number of machines must either be a
   * perfect square. We partially address this limitation by computing the machine assignment to
   * the next
   * largest perfect square and then mapping back down to the actual number of machines.
   * Unfortunately, this can also lead to work imbalance and so it is suggested that a perfect
   * square is used.
   */
  static public  class EdgePartition2D$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    public   EdgePartition2D$ () { throw new RuntimeException(); }
    public  int getPartition (long src, long dst, int numParts) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Assigns edges to partitions using only the source vertex ID, colocating edges with the same
   * source.
   */
  static public  class EdgePartition1D$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    public   EdgePartition1D$ () { throw new RuntimeException(); }
    public  int getPartition (long src, long dst, int numParts) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Assigns edges to partitions by hashing the source and destination vertex IDs, resulting in a
   * random vertex cut that colocates all same-direction edges between two vertices.
   */
  static public  class RandomVertexCut$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    public   RandomVertexCut$ () { throw new RuntimeException(); }
    public  int getPartition (long src, long dst, int numParts) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Assigns edges to partitions by hashing the source and destination vertex IDs in a canonical
   * direction, resulting in a random vertex cut that colocates all edges between two vertices,
   * regardless of direction.
   */
  static public  class CanonicalRandomVertexCut$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    public   CanonicalRandomVertexCut$ () { throw new RuntimeException(); }
    public  int getPartition (long src, long dst, int numParts) { throw new RuntimeException(); }
  }
  /** Returns the PartitionStrategy with the specified name. */
  static public  org.apache.spark.graphx.PartitionStrategy fromString (java.lang.String s) { throw new RuntimeException(); }
  /** Returns the partition number for a given edge. */
  public abstract  int getPartition (long src, long dst, int numParts) ;
}
