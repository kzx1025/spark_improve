package org.apache.spark.graphx;
/**
 * <code>EdgeRDD[ED, VD]</code> extends <code>RDD[Edge[ED}</code> by storing the edges in columnar format on each
 * partition for performance. It may additionally store the vertex attributes associated with each
 * edge to provide the triplet view. Shipping of the vertex attributes is managed by
 * <code>impl.ReplicatedVertexView</code>.
 */
public  class EdgeRDD<ED extends java.lang.Object, VD extends java.lang.Object> extends org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> {
  /**
   * Creates an EdgeRDD from a set of edges.
   * <p>
   * @tparam ED the edge attribute type
   * @tparam VD the type of the vertex attributes that may be joined with the returned EdgeRDD
   */
  static public <ED extends java.lang.Object, VD extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED, VD> fromEdges (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, scala.reflect.ClassTag<ED> evidence$10, scala.reflect.ClassTag<VD> evidence$11) { throw new RuntimeException(); }
  /**
   * Creates an EdgeRDD from already-constructed edge partitions.
   * <p>
   * @tparam ED the edge attribute type
   * @tparam VD the type of the vertex attributes that may be joined with the returned EdgeRDD
   */
  static public <ED extends java.lang.Object, VD extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED, VD> fromEdgePartitions (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> edgePartitions, scala.reflect.ClassTag<ED> evidence$12, scala.reflect.ClassTag<VD> evidence$13) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> partitionsRDD () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel targetStorageLevel () { throw new RuntimeException(); }
  // not preceding
  public   EdgeRDD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> partitionsRDD, org.apache.spark.storage.StorageLevel targetStorageLevel, scala.reflect.ClassTag<ED> evidence$1, scala.reflect.ClassTag<VD> evidence$2) { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  /**
   * If <code>partitionsRDD</code> already has a partitioner, use it. Otherwise assume that the
   * {@link PartitionID}s in <code>partitionsRDD</code> correspond to the actual partitions and create a new
   * partitioner that allows co-partitioning with <code>partitionsRDD</code>.
   */
  public  scala.Option<org.apache.spark.Partitioner> partitioner () { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.graphx.Edge<ED>> compute (org.apache.spark.Partition part, org.apache.spark.TaskContext context, org.apache.spark.scheduler.ShuffleMemorySignal shuffleMemorySignal) { throw new RuntimeException(); }
  public  org.apache.spark.graphx.Edge<ED>[] collect () { throw new RuntimeException(); }
  /**
   * Persists the edge partitions at the specified storage level, ignoring any existing target
   * storage level.
   */
  public  org.apache.spark.graphx.EdgeRDD<ED, VD> persist (org.apache.spark.storage.StorageLevel newLevel) { throw new RuntimeException(); }
  public  org.apache.spark.graphx.EdgeRDD<ED, VD> unpersist (boolean blocking) { throw new RuntimeException(); }
  /** Persists the vertex partitions using `targetStorageLevel`, which defaults to MEMORY_ONLY. */
  public  org.apache.spark.graphx.EdgeRDD<ED, VD> cache () { throw new RuntimeException(); }
  private <ED2 extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED2, VD2> mapEdgePartitions (scala.Function2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>, org.apache.spark.graphx.impl.EdgePartition<ED2, VD2>> f, scala.reflect.ClassTag<ED2> evidence$3, scala.reflect.ClassTag<VD2> evidence$4) { throw new RuntimeException(); }
  /**
   * Map the values in an edge partitioning preserving the structure but changing the values.
   * <p>
   * @tparam ED2 the new edge value type
   * @param f the function from an edge to a new edge value
   * @return a new EdgeRDD containing the new edge values
   */
  public <ED2 extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED2, VD> mapValues (scala.Function1<org.apache.spark.graphx.Edge<ED>, ED2> f, scala.reflect.ClassTag<ED2> evidence$5) { throw new RuntimeException(); }
  /**
   * Reverse all the edges in this RDD.
   * <p>
   * @return a new EdgeRDD containing all the edges reversed
   */
  public  org.apache.spark.graphx.EdgeRDD<ED, VD> reverse () { throw new RuntimeException(); }
  /** Removes all edges but those matching `epred` and where both vertices match `vpred`. */
  public  org.apache.spark.graphx.EdgeRDD<ED, VD> filter (scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, java.lang.Object> epred, scala.Function2<java.lang.Object, VD, java.lang.Object> vpred) { throw new RuntimeException(); }
  /**
   * Inner joins this EdgeRDD with another EdgeRDD, assuming both are partitioned using the same
   * {@link PartitionStrategy}.
   * <p>
   * @param other the EdgeRDD to join with
   * @param f the join function applied to corresponding values of <code>this</code> and <code>other</code>
   * @return a new EdgeRDD containing only edges that appear in both <code>this</code> and <code>other</code>,
   *         with values supplied by <code>f</code>
   */
  public <ED2 extends java.lang.Object, ED3 extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED3, VD> innerJoin (org.apache.spark.graphx.EdgeRDD<ED2, ?> other, scala.Function4<java.lang.Object, java.lang.Object, ED, ED2, ED3> f, scala.reflect.ClassTag<ED2> evidence$6, scala.reflect.ClassTag<ED3> evidence$7) { throw new RuntimeException(); }
  /** Replaces the vertex partitions while preserving all other properties of the VertexRDD. */
  private <ED2 extends java.lang.Object, VD2 extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED2, VD2> withPartitionsRDD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED2, VD2>>> partitionsRDD, scala.reflect.ClassTag<ED2> evidence$8, scala.reflect.ClassTag<VD2> evidence$9) { throw new RuntimeException(); }
  /**
   * Changes the target storage level while preserving all other properties of the
   * EdgeRDD. Operations on the returned EdgeRDD will preserve this storage level.
   * <p>
   * This does not actually trigger a cache; to do this, call
   * {@link org.apache.spark.graphx.EdgeRDD#cache} on the returned EdgeRDD.
   */
  private  org.apache.spark.graphx.EdgeRDD<ED, VD> withTargetStorageLevel (org.apache.spark.storage.StorageLevel targetStorageLevel) { throw new RuntimeException(); }
}
