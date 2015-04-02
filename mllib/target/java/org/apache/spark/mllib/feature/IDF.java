package org.apache.spark.mllib.feature;
/**
 * :: Experimental ::
 * Inverse document frequency (IDF).
 * The standard formulation is used: <code>idf = log((m + 1) / (d(t) + 1))</code>, where <code>m</code> is the total
 * number of documents and <code>d(t)</code> is the number of documents that contain term <code>t</code>.
 */
public  class IDF {
  /** Document frequency aggregator. */
  static public  class DocumentFrequencyAggregator implements scala.Serializable {
    public   DocumentFrequencyAggregator () { throw new RuntimeException(); }
    /** number of documents */
    private  long m () { throw new RuntimeException(); }
    /** document frequency vector */
    private  breeze.linalg.DenseVector<java.lang.Object> df () { throw new RuntimeException(); }
    /** Adds a new document. */
    public  org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator add (org.apache.spark.mllib.linalg.Vector doc) { throw new RuntimeException(); }
    /** Merges another. */
    public  org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator merge (org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator other) { throw new RuntimeException(); }
    private  boolean isEmpty () { throw new RuntimeException(); }
    /** Returns the current IDF vector. */
    public  org.apache.spark.mllib.linalg.Vector idf () { throw new RuntimeException(); }
  }
  public   IDF () { throw new RuntimeException(); }
  /**
   * Computes the inverse document frequency.
   * @param dataset an RDD of term frequency vectors
   */
  public  org.apache.spark.mllib.feature.IDFModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> dataset) { throw new RuntimeException(); }
  /**
   * Computes the inverse document frequency.
   * @param dataset a JavaRDD of term frequency vectors
   */
  public  org.apache.spark.mllib.feature.IDFModel fit (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> dataset) { throw new RuntimeException(); }
}
