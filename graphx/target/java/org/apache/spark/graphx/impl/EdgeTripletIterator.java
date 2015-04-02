package org.apache.spark.graphx.impl;
/**
 * The Iterator type returned when constructing edge triplets. This could be an anonymous class in
 * EdgePartition.tripletIterator, but we name it here explicitly so it is easier to debug / profile.
 */
private  class EdgeTripletIterator<VD extends java.lang.Object, ED extends java.lang.Object> implements scala.collection.Iterator<org.apache.spark.graphx.EdgeTriplet<VD, ED>> {
  public  org.apache.spark.graphx.impl.EdgePartition<ED, VD> edgePartition () { throw new RuntimeException(); }
  public  boolean includeSrc () { throw new RuntimeException(); }
  public  boolean includeDst () { throw new RuntimeException(); }
  // not preceding
  public   EdgeTripletIterator (org.apache.spark.graphx.impl.EdgePartition<ED, VD> edgePartition, boolean includeSrc, boolean includeDst, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2) { throw new RuntimeException(); }
  private  int pos () { throw new RuntimeException(); }
  public  boolean hasNext () { throw new RuntimeException(); }
  public  org.apache.spark.graphx.EdgeTriplet<VD, ED> next () { throw new RuntimeException(); }
}
