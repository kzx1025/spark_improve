package org.apache.spark.bagel;
public  interface Combiner<M extends java.lang.Object, C extends java.lang.Object> {
  public abstract  C createCombiner (M msg) ;
  public abstract  C mergeMsg (C combiner, M msg) ;
  public abstract  C mergeCombiners (C a, C b) ;
}
