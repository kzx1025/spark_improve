package org.apache.spark.mllib.clustering;
/**
 * A breeze vector with its norm for fast distance computation.
 * <p>
 * @see org.apache.spark.mllib.clustering.KMeans#fastSquaredDistance
 */
private  class BreezeVectorWithNorm implements scala.Serializable {
  public  breeze.linalg.Vector<java.lang.Object> vector () { throw new RuntimeException(); }
  public  double norm () { throw new RuntimeException(); }
  // not preceding
  public   BreezeVectorWithNorm (breeze.linalg.Vector<java.lang.Object> vector, double norm) { throw new RuntimeException(); }
  public   BreezeVectorWithNorm (breeze.linalg.Vector<java.lang.Object> vector) { throw new RuntimeException(); }
  public   BreezeVectorWithNorm (double[] array) { throw new RuntimeException(); }
  public   BreezeVectorWithNorm (org.apache.spark.mllib.linalg.Vector v) { throw new RuntimeException(); }
  /** Converts the vector to a dense vector. */
  public  org.apache.spark.mllib.clustering.BreezeVectorWithNorm toDense () { throw new RuntimeException(); }
}
