package org.apache.spark.graphx.impl;
/**
 * An Iterator type for internal use that reuses EdgeTriplet objects. This could be an anonymous
 * class in EdgePartition.upgradeIterator, but we name it here explicitly so it is easier to debug /
 * profile.
 */
private  class ReusingEdgeTripletIterator<VD extends java.lang.Object, ED extends java.lang.Object> implements scala.collection.Iterator<org.apache.spark.graphx.EdgeTriplet<VD, ED>> {
  public  scala.collection.Iterator<org.apache.spark.graphx.Edge<ED>> edgeIter () { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> edgePartition () { throw new RuntimeException(); }
  public  boolean includeSrc () { throw new RuntimeException(); }
  public  boolean includeDst () { throw new RuntimeException(); }
  // not preceding
  public   ReusingEdgeTripletIterator (scala.collection.Iterator<org.apache.spark.graphx.Edge<ED>> edgeIter, org.apache.spark.graphx.impl.EdgePartition<ED, VD> edgePartition, boolean includeSrc, boolean includeDst, scala.reflect.ClassTag<VD> evidence$3, scala.reflect.ClassTag<ED> evidence$4) { throw new RuntimeException(); }
  private  org.apache.spark.graphx.EdgeTriplet<VD, ED> triplet () { throw new RuntimeException(); }
  public  boolean hasNext () { throw new RuntimeException(); }
  public  org.apache.spark.graphx.EdgeTriplet<VD, ED> next () { throw new RuntimeException(); }
}
