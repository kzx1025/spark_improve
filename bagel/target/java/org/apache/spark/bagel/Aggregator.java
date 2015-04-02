package org.apache.spark.bagel;
public  interface Aggregator<V extends java.lang.Object, A extends java.lang.Object> {
  public abstract  A createAggregator (V vert) ;
  public abstract  A mergeAggregators (A a, A b) ;
}
