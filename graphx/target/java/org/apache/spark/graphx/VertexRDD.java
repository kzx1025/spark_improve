package org.apache.spark.graphx;
/**
 * Extends <code>RDD[(VertexId, VD)]</code> by ensuring that there is only one entry for each vertex and by
 * pre-indexing the entries for fast, efficient joins. Two VertexRDDs with the same index can be
 * joined efficiently. All operations except {@link reindex} preserve the index. To construct a
 * <code>VertexRDD</code>, use the {@link org.apache.spark.graphx.VertexRDD$ VertexRDD object}.
 * <p>
 * Additionally, stores routing information to enable joining the vertex attributes with an
 * {@link EdgeRDD}.
 * <p>
 * @example Construct a <code>VertexRDD</code> from a plain RDD:
 * <pre><code>
 * // Construct an initial vertex set
 * val someData: RDD[(VertexId, SomeType)] = loadData(someFile)
 * val vset = VertexRDD(someData)
 * // If there were redundant values in someData we would use a reduceFunc
 * val vset2 = VertexRDD(someData, reduceFunc)
 * // Finally we can use the VertexRDD to index another dataset
 * val otherData: RDD[(VertexId, OtherType)] = loadData(otherFile)
 * val vset3 = vset2.innerJoin(otherData) { (vid, a, b) =&gt; b }
 * // Now we can construct very fast joins between the two sets
 * val vset4: VertexRDD[(SomeType, OtherType)] = vset.leftJoin(vset3)
 * </code></pre>
 * <p>
 * @tparam VD the vertex attribute associated with each vertex in the set.
 */
public  class VertexRDD<VD extends java.lang.Object> extends org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> {
  /**
   * Constructs a standalone <code>VertexRDD</code> (one that is not set up for efficient joins with an
   * {@link EdgeRDD}) from an RDD of vertex-attribute pairs. Duplicate entries are removed arbitrarily.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, scala.reflect.ClassTag<VD> evidence$15) { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> from an RDD of vertex-attribute pairs. Duplicate vertex entries are
   * removed arbitrarily. The resulting <code>VertexRDD</code> will be joinable with <code>edges</code>, and any missing
   * vertices referred to by <code>edges</code> will be created with the attribute <code>defaultVal</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   * @param edges the {@link EdgeRDD} that these vertices may be joined with
   * @param defaultVal the vertex attribute to use when creating missing vertices
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.graphx.EdgeRDD<?, ?> edges, VD defaultVal, scala.reflect.ClassTag<VD> evidence$16) { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> from an RDD of vertex-attribute pairs. Duplicate vertex entries are
   * merged using <code>mergeFunc</code>. The resulting <code>VertexRDD</code> will be joinable with <code>edges</code>, and any
   * missing vertices referred to by <code>edges</code> will be created with the attribute <code>defaultVal</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param vertices the collection of vertex-attribute pairs
   * @param edges the {@link EdgeRDD} that these vertices may be joined with
   * @param defaultVal the vertex attribute to use when creating missing vertices
   * @param mergeFunc the commutative, associative duplicate vertex attribute merge function
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.graphx.EdgeRDD<?, ?> edges, VD defaultVal, scala.Function2<VD, VD, VD> mergeFunc, scala.reflect.ClassTag<VD> evidence$17) { throw new RuntimeException(); }
  /**
   * Constructs a <code>VertexRDD</code> containing all vertices referred to in <code>edges</code>. The vertices will be
   * created with the attribute <code>defaultVal</code>. The resulting <code>VertexRDD</code> will be joinable with
   * <code>edges</code>.
   * <p>
   * @tparam VD the vertex attribute type
   * <p>
   * @param edges the {@link EdgeRDD} referring to the vertices to create
   * @param numPartitions the desired number of partitions for the resulting <code>VertexRDD</code>
   * @param defaultVal the vertex attribute to use when creating missing vertices
   */
  static public <VD extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD> fromEdges (org.apache.spark.graphx.EdgeRDD<?, ?> edges, int numPartitions, VD defaultVal, scala.reflect.ClassTag<VD> evidence$18) { throw new RuntimeException(); }
  static private  org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.RoutingTablePartition> createRoutingTables (org.apache.spark.graphx.EdgeRDD<?, ?> edges, org.apache.spark.Partitioner vertexPartitioner) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.ShippableVertexPartition<VD>> partitionsRDD () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel targetStorageLevel () { throw new RuntimeException(); }
  // not preceding
  public   VertexRDD (org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.ShippableVertexPartition<VD>> partitionsRDD, org.apache.spark.storage.StorageLevel targetStorageLevel, scala.reflect.ClassTag<VD> evidence$1) { throw new RuntimeException(); }
  /**
   * Construct a new VertexRDD that is indexed by only the visible vertices. The resulting
   * VertexRDD will be based on a different index and can no longer be quickly joined with this
   * RDD.
   */
  public  org.apache.spark.graphx.VertexRDD<VD> reindex () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner () { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition s) { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> setName (java.lang.String _name) { throw new RuntimeException(); }
  /**
   * Persists the vertex partitions at the specified storage level, ignoring any existing target
   * storage level.
   */
  public  org.apache.spark.graphx.VertexRDD<VD> persist (org.apache.spark.storage.StorageLevel newLevel) { throw new RuntimeException(); }
  public  org.apache.spark.graphx.VertexRDD<VD> unpersist (boolean blocking) { throw new RuntimeException(); }
  /** Persists the vertex partitions at `targetStorageLevel`, which defaults to MEMORY_ONLY. */
  public  org.apache.spark.graphx.VertexRDD<VD> cache () { throw new RuntimeException(); }
  /** The number of vertices in the RDD. */
  public  long count () { throw new RuntimeException(); }
  /**
   * Provides the <code>RDD[(VertexId, VD)]</code> equivalent output.
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> compute (org.apache.spark.Partition part, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  /**
   * Applies a function to each <code>VertexPartition</code> of this RDD and returns a new VertexRDD.
   */
  private <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapVertexPartitions (scala.Function1<org.apache.spark.graphx.impl.ShippableVertexPartition<VD>, org.apache.spark.graphx.impl.ShippableVertexPartition<VD2>> f, scala.reflect.ClassTag<VD2> evidence$2) { throw new RuntimeException(); }
  /**
   * Restricts the vertex set to the set of vertices satisfying the given predicate. This operation
   * preserves the index for efficient joins with the original RDD, and it sets bits in the bitmask
   * rather than allocating new memory.
   * <p>
   * @param pred the user defined predicate, which takes a tuple to conform to the
   * <code>RDD[(VertexId, VD)]</code> interface
   */
  public  org.apache.spark.graphx.VertexRDD<VD> filter (scala.Function1<scala.Tuple2<java.lang.Object, VD>, java.lang.Object> pred) { throw new RuntimeException(); }
  /**
   * Maps each vertex attribute, preserving the index.
   * <p>
   * @tparam VD2 the type returned by the map function
   * <p>
   * @param f the function applied to each value in the RDD
   * @return a new VertexRDD with values obtained by applying <code>f</code> to each of the entries in the
   * original VertexRDD
   */
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapValues (scala.Function1<VD, VD2> f, scala.reflect.ClassTag<VD2> evidence$3) { throw new RuntimeException(); }
  /**
   * Maps each vertex attribute, additionally supplying the vertex ID.
   * <p>
   * @tparam VD2 the type returned by the map function
   * <p>
   * @param f the function applied to each ID-value pair in the RDD
   * @return a new VertexRDD with values obtained by applying <code>f</code> to each of the entries in the
   * original VertexRDD.  The resulting VertexRDD retains the same index.
   */
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> mapValues (scala.Function2<java.lang.Object, VD, VD2> f, scala.reflect.ClassTag<VD2> evidence$4) { throw new RuntimeException(); }
  /**
   * Hides vertices that are the same between <code>this</code> and <code>other</code>; for vertices that are different,
   * keeps the values from <code>other</code>.
   */
  public  org.apache.spark.graphx.VertexRDD<VD> diff (org.apache.spark.graphx.VertexRDD<VD> other) { throw new RuntimeException(); }
  /**
   * Left joins this RDD with another VertexRDD with the same index. This function will fail if
   * both VertexRDDs do not share the same index. The resulting vertex set contains an entry for
   * each vertex in <code>this</code>.
   * If <code>other</code> is missing any vertex in this VertexRDD, <code>f</code> is passed <code>None</code>.
   * <p>
   * @tparam VD2 the attribute type of the other VertexRDD
   * @tparam VD3 the attribute type of the resulting VertexRDD
   * <p>
   * @param other the other VertexRDD with which to join.
   * @param f the function mapping a vertex id and its attributes in this and the other vertex set
   * to a new vertex attribute.
   * @return a VertexRDD containing the results of <code>f</code>
   */
  public <VD2 extends java.lang.Object, VD3 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD3> leftZipJoin (org.apache.spark.graphx.VertexRDD<VD2> other, scala.Function3<java.lang.Object, VD, scala.Option<VD2>, VD3> f, scala.reflect.ClassTag<VD2> evidence$5, scala.reflect.ClassTag<VD3> evidence$6) { throw new RuntimeException(); }
  /**
   * Left joins this VertexRDD with an RDD containing vertex attribute pairs. If the other RDD is
   * backed by a VertexRDD with the same index then the efficient {@link leftZipJoin} implementation is
   * used. The resulting VertexRDD contains an entry for each vertex in <code>this</code>. If <code>other</code> is
   * missing any vertex in this VertexRDD, <code>f</code> is passed <code>None</code>. If there are duplicates,
   * the vertex is picked arbitrarily.
   * <p>
   * @tparam VD2 the attribute type of the other VertexRDD
   * @tparam VD3 the attribute type of the resulting VertexRDD
   * <p>
   * @param other the other VertexRDD with which to join
   * @param f the function mapping a vertex id and its attributes in this and the other vertex set
   * to a new vertex attribute.
   * @return a VertexRDD containing all the vertices in this VertexRDD with the attributes emitted
   * by <code>f</code>.
   */
  public <VD2 extends java.lang.Object, VD3 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD3> leftJoin (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD2>> other, scala.Function3<java.lang.Object, VD, scala.Option<VD2>, VD3> f, scala.reflect.ClassTag<VD2> evidence$7, scala.reflect.ClassTag<VD3> evidence$8) { throw new RuntimeException(); }
  /**
   * Efficiently inner joins this VertexRDD with another VertexRDD sharing the same index. See
   * {@link innerJoin} for the behavior of the join.
   */
  public <U extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> innerZipJoin (org.apache.spark.graphx.VertexRDD<U> other, scala.Function3<java.lang.Object, VD, U, VD2> f, scala.reflect.ClassTag<U> evidence$9, scala.reflect.ClassTag<VD2> evidence$10) { throw new RuntimeException(); }
  /**
   * Inner joins this VertexRDD with an RDD containing vertex attribute pairs. If the other RDD is
   * backed by a VertexRDD with the same index then the efficient {@link innerZipJoin} implementation
   * is used.
   * <p>
   * @param other an RDD containing vertices to join. If there are multiple entries for the same
   * vertex, one is picked arbitrarily. Use {@link aggregateUsingIndex} to merge multiple entries.
   * @param f the join function applied to corresponding values of <code>this</code> and <code>other</code>
   * @return a VertexRDD co-indexed with <code>this</code>, containing only vertices that appear in both
   *         <code>this</code> and <code>other</code>, with values supplied by <code>f</code>
   */
  public <U extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> innerJoin (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, U>> other, scala.Function3<java.lang.Object, VD, U, VD2> f, scala.reflect.ClassTag<U> evidence$11, scala.reflect.ClassTag<VD2> evidence$12) { throw new RuntimeException(); }
  /**
   * Aggregates vertices in <code>messages</code> that have the same ids using <code>reduceFunc</code>, returning a
   * VertexRDD co-indexed with <code>this</code>.
   * <p>
   * @param messages an RDD containing messages to aggregate, where each message is a pair of its
   * target vertex ID and the message data
   * @param reduceFunc the associative aggregation function for merging messages to the same vertex
   * @return a VertexRDD co-indexed with <code>this</code>, containing only vertices that received messages.
   * For those vertices, their values are the result of applying <code>reduceFunc</code> to all received
   * messages.
   */
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> aggregateUsingIndex (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD2>> messages, scala.Function2<VD2, VD2, VD2> reduceFunc, scala.reflect.ClassTag<VD2> evidence$13) { throw new RuntimeException(); }
  /**
   * Returns a new <code>VertexRDD</code> reflecting a reversal of all edge directions in the corresponding
   * {@link EdgeRDD}.
   */
  public  org.apache.spark.graphx.VertexRDD<VD> reverseRoutingTables () { throw new RuntimeException(); }
  /** Prepares this VertexRDD for efficient joins with the given EdgeRDD. */
  public  org.apache.spark.graphx.VertexRDD<VD> withEdges (org.apache.spark.graphx.EdgeRDD<?, ?> edges) { throw new RuntimeException(); }
  /** Replaces the vertex partitions while preserving all other properties of the VertexRDD. */
  private <VD2 extends java.lang.Object> org.apache.spark.graphx.VertexRDD<VD2> withPartitionsRDD (org.apache.spark.rdd.RDD<org.apache.spark.graphx.impl.ShippableVertexPartition<VD2>> partitionsRDD, scala.reflect.ClassTag<VD2> evidence$14) { throw new RuntimeException(); }
  /**
   * Changes the target storage level while preserving all other properties of the
   * VertexRDD. Operations on the returned VertexRDD will preserve this storage level.
   * <p>
   * This does not actually trigger a cache; to do this, call
   * {@link org.apache.spark.graphx.VertexRDD#cache} on the returned VertexRDD.
   */
  private  org.apache.spark.graphx.VertexRDD<VD> withTargetStorageLevel (org.apache.spark.storage.StorageLevel targetStorageLevel) { throw new RuntimeException(); }
  /** Generates an RDD of vertex attributes suitable for shipping to the edge partitions. */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.VertexAttributeBlock<VD>>> shipVertexAttributes (boolean shipSrc, boolean shipDst) { throw new RuntimeException(); }
  /** Generates an RDD of vertex IDs suitable for shipping to the edge partitions. */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, long[]>> shipVertexIds () { throw new RuntimeException(); }
}
