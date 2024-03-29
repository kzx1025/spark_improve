package org.apache.spark.mllib.clustering;
// no position
/**
 * An utility object to run K-means locally. This is private to the ML package because it's used
 * in the initialization of KMeans but not meant to be publicly exposed.
 */
private  class LocalKMeans$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LocalKMeans$ MODULE$ = null;
  public   LocalKMeans$ () { throw new RuntimeException(); }
  /**
   * Run K-means++ on the weighted point set <code>points</code>. This first does the K-means++
   * initialization procedure and then rounds of Lloyd's algorithm.
   */
  public  org.apache.spark.mllib.clustering.BreezeVectorWithNorm[] kMeansPlusPlus (int seed, org.apache.spark.mllib.clustering.BreezeVectorWithNorm[] points, double[] weights, int k, int maxIterations) { throw new RuntimeException(); }
  private <T extends java.lang.Object> T pickWeighted (scala.util.Random rand, java.lang.Object data, double[] weights) { throw new RuntimeException(); }
}
