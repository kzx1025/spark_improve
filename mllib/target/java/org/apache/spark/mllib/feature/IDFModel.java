package org.apache.spark.mllib.feature;
/**
 * :: Experimental ::
 * Represents an IDF model that can transform term frequency vectors.
 */
public  class IDFModel implements scala.Serializable {
  public  org.apache.spark.mllib.linalg.Vector idf () { throw new RuntimeException(); }
  // not preceding
  private   IDFModel (org.apache.spark.mllib.linalg.Vector idf) { throw new RuntimeException(); }
  /**
   * Transforms term frequency (TF) vectors to TF-IDF vectors.
   * @param dataset an RDD of term frequency vectors
   * @return an RDD of TF-IDF vectors
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> dataset) { throw new RuntimeException(); }
  /**
   * Transforms term frequency (TF) vectors to TF-IDF vectors (Java version).
   * @param dataset a JavaRDD of term frequency vectors
   * @return a JavaRDD of TF-IDF vectors
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> dataset) { throw new RuntimeException(); }
}
