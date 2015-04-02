package org.apache.spark.graphx.impl;
/**
 * A collection of edges stored in columnar format, along with any vertex attributes referenced. The
 * edges are stored in 3 large columnar arrays (src, dst, attribute). The arrays are clustered by
 * src. There is an optional active vertex set for filtering computation on the edges.
 * <p>
 * @tparam ED the edge attribute type
 * @tparam VD the vertex attribute type
 * <p>
 * @param srcIds the source vertex id of each edge
 * @param dstIds the destination vertex id of each edge
 * @param data the attribute associated with each edge
 * @param index a clustered index on source vertex id
 * @param vertices a map from referenced vertex ids to their corresponding attributes. Must
 *   contain all vertex ids from <code>srcIds</code> and <code>dstIds</code>, though not necessarily valid attributes for
 *   those vertex ids. The mask is not used.
 * @param activeSet an optional active vertex set for filtering computation on the edges
 */
private  class EdgePartition<ED extends java.lang.Object, VD extends java.lang.Object> implements scala.Serializable {
  public  long[] srcIds () { throw new RuntimeException(); }
  public  long[] dstIds () { throw new RuntimeException(); }
  public  java.lang.Object data () { throw new RuntimeException(); }
  public  org.apache.spark.graphx.util.collection.GraphXPrimitiveKeyOpenHashMap<java.lang.Object, java.lang.Object> index () { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.VertexPartition<VD> vertices () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.collection.OpenHashSet<java.lang.Object>> activeSet () { throw new RuntimeException(); }
  // not preceding
  public   EdgePartition (long[] srcIds, long[] dstIds, java.lang.Object data, org.apache.spark.graphx.util.collection.GraphXPrimitiveKeyOpenHashMap<java.lang.Object, java.lang.Object> index, org.apache.spark.graphx.impl.VertexPartition<VD> vertices, scala.Option<org.apache.spark.util.collection.OpenHashSet<java.lang.Object>> activeSet, scala.reflect.ClassTag<ED> evidence$1, scala.reflect.ClassTag<VD> evidence$2) { throw new RuntimeException(); }
  /** Return a new `EdgePartition` with the specified edge data. */
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.impl.EdgePartition<ED2, VD> withData (java.lang.Object data_, scala.reflect.ClassTag<ED2> evidence$3) { throw new RuntimeException(); }
  /** Return a new `EdgePartition` with the specified vertex partition. */
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.impl.EdgePartition<ED, VD2> withVertices (org.apache.spark.graphx.impl.VertexPartition<VD2> vertices_, scala.reflect.ClassTag<VD2> evidence$4) { throw new RuntimeException(); }
  /** Return a new `EdgePartition` with the specified active set, provided as an iterator. */
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> withActiveSet (scala.collection.Iterator<java.lang.Object> iter) { throw new RuntimeException(); }
  /** Return a new `EdgePartition` with the specified active set. */
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> withActiveSet (scala.Option<org.apache.spark.util.collection.OpenHashSet<java.lang.Object>> activeSet_) { throw new RuntimeException(); }
  /** Return a new `EdgePartition` with updates to vertex attributes specified in `iter`. */
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> updateVertices (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter) { throw new RuntimeException(); }
  /** Look up vid in activeSet, throwing an exception if it is None. */
  public  boolean isActive (long vid) { throw new RuntimeException(); }
  /** The number of active vertices, if any exist. */
  public  scala.Option<java.lang.Object> numActives () { throw new RuntimeException(); }
  /**
   * Reverse all the edges in this partition.
   * <p>
   * @return a new edge partition with all edges reversed.
   */
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> reverse () { throw new RuntimeException(); }
  /**
   * Construct a new edge partition by applying the function f to all
   * edges in this partition.
   * <p>
   * Be careful not to keep references to the objects passed to <code>f</code>.
   * To improve GC performance the same object is re-used for each call.
   * <p>
   * @param f a function from an edge to a new attribute
   * @tparam ED2 the type of the new attribute
   * @return a new edge partition with the result of the function <code>f</code>
   *         applied to each edge
   */
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.impl.EdgePartition<ED2, VD> map (scala.Function1<org.apache.spark.graphx.Edge<ED>, ED2> f, scala.reflect.ClassTag<ED2> evidence$5) { throw new RuntimeException(); }
  /**
   * Construct a new edge partition by using the edge attributes
   * contained in the iterator.
   * <p>
   * @note The input iterator should return edge attributes in the
   * order of the edges returned by <code>EdgePartition.iterator</code> and
   * should return attributes equal to the number of edges.
   * <p>
   * @param iter an iterator for the new attribute values
   * @tparam ED2 the type of the new attribute
   * @return a new edge partition with the attribute values replaced
   */
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.impl.EdgePartition<ED2, VD> map (scala.collection.Iterator<ED2> iter, scala.reflect.ClassTag<ED2> evidence$6) { throw new RuntimeException(); }
  /**
   * Construct a new edge partition containing only the edges matching <code>epred</code> and where both
   * vertices match <code>vpred</code>.
   */
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> filter (scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, java.lang.Object> epred, scala.Function2<java.lang.Object, VD, java.lang.Object> vpred) { throw new RuntimeException(); }
  /**
   * Apply the function f to all edges in this partition.
   * <p>
   * @param f an external state mutating user defined function.
   */
  public  void foreach (scala.Function1<org.apache.spark.graphx.Edge<ED>, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
  /**
   * Merge all the edges with the same src and dest id into a single
   * edge using the <code>merge</code> function
   * <p>
   * @param merge a commutative associative merge operation
   * @return a new edge partition without duplicate edges
   */
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> groupEdges (scala.Function2<ED, ED, ED> merge) { throw new RuntimeException(); }
  /**
   * Apply <code>f</code> to all edges present in both <code>this</code> and <code>other</code> and return a new <code>EdgePartition</code>
   * containing the resulting edges.
   * <p>
   * If there are multiple edges with the same src and dst in <code>this</code>, <code>f</code> will be invoked once for
   * each edge, but each time it may be invoked on any corresponding edge in <code>other</code>.
   * <p>
   * If there are multiple edges with the same src and dst in <code>other</code>, <code>f</code> will only be invoked
   * once.
   */
  public <ED2 extends java.lang.Object, ED3 extends java.lang.Object> org.apache.spark.graphx.impl.EdgePartition<ED3, VD> innerJoin (org.apache.spark.graphx.impl.EdgePartition<ED2, ?> other, scala.Function4<java.lang.Object, java.lang.Object, ED, ED2, ED3> f, scala.reflect.ClassTag<ED2> evidence$7, scala.reflect.ClassTag<ED3> evidence$8) { throw new RuntimeException(); }
  /**
   * The number of edges in this partition
   * <p>
   * @return size of the partition
   */
  public  int size () { throw new RuntimeException(); }
  /** The number of unique source vertices in the partition. */
  public  int indexSize () { throw new RuntimeException(); }
  /**
   * Get an iterator over the edges in this partition.
   * <p>
   * Be careful not to keep references to the objects from this iterator.
   * To improve GC performance the same object is re-used in <code>next()</code>.
   * <p>
   * @return an iterator over edges in the partition
   */
  public  java.lang.Object iterator () { throw new RuntimeException(); }
  /**
   * Get an iterator over the edge triplets in this partition.
   * <p>
   * It is safe to keep references to the objects from this iterator.
   */
  public  scala.collection.Iterator<org.apache.spark.graphx.EdgeTriplet<VD, ED>> tripletIterator (boolean includeSrc, boolean includeDst) { throw new RuntimeException(); }
  /**
   * Upgrade the given edge iterator into a triplet iterator.
   * <p>
   * Be careful not to keep references to the objects from this iterator. To improve GC performance
   * the same object is re-used in <code>next()</code>.
   */
  public  scala.collection.Iterator<org.apache.spark.graphx.EdgeTriplet<VD, ED>> upgradeIterator (scala.collection.Iterator<org.apache.spark.graphx.Edge<ED>> edgeIter, boolean includeSrc, boolean includeDst) { throw new RuntimeException(); }
  /**
   * Get an iterator over the edges in this partition whose source vertex ids match srcIdPred. The
   * iterator is generated using an index scan, so it is efficient at skipping edges that don't
   * match srcIdPred.
   * <p>
   * Be careful not to keep references to the objects from this iterator. To improve GC performance
   * the same object is re-used in <code>next()</code>.
   */
  public  scala.collection.Iterator<org.apache.spark.graphx.Edge<ED>> indexIterator (scala.Function1<java.lang.Object, java.lang.Object> srcIdPred) { throw new RuntimeException(); }
  /**
   * Get an iterator over the cluster of edges in this partition with source vertex id <code>srcId</code>. The
   * cluster must start at position <code>index</code>.
   * <p>
   * Be careful not to keep references to the objects from this iterator. To improve GC performance
   * the same object is re-used in <code>next()</code>.
   */
  private  java.lang.Object clusterIterator (long srcId, int index) { throw new RuntimeException(); }
}
