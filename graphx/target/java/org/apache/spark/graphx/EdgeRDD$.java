package org.apache.spark.graphx;
// no position
public  class EdgeRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EdgeRDD$ MODULE$ = null;
  public   EdgeRDD$ () { throw new RuntimeException(); }
  /**
   * Creates an EdgeRDD from a set of edges.
   * <p>
   * @tparam ED the edge attribute type
   * @tparam VD the type of the vertex attributes that may be joined with the returned EdgeRDD
   */
  public <ED extends java.lang.Object, VD extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED, VD> fromEdges (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, scala.reflect.ClassTag<ED> evidence$10, scala.reflect.ClassTag<VD> evidence$11) { throw new RuntimeException(); }
  /**
   * Creates an EdgeRDD from already-constructed edge partitions.
   * <p>
   * @tparam ED the edge attribute type
   * @tparam VD the type of the vertex attributes that may be joined with the returned EdgeRDD
   */
  public <ED extends java.lang.Object, VD extends java.lang.Object> org.apache.spark.graphx.EdgeRDD<ED, VD> fromEdgePartitions (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> edgePartitions, scala.reflect.ClassTag<ED> evidence$12, scala.reflect.ClassTag<VD> evidence$13) { throw new RuntimeException(); }
}
