package org.apache.spark.mllib.feature;
/**
 * :: DeveloperApi ::
 * Trait for transformation of a vector
 */
public abstract interface VectorTransformer extends scala.Serializable {
  /**
   * Applies transformation on a vector.
   * <p>
   * @param vector vector to be transformed.
   * @return transformed vector.
   */
  public abstract  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector) ;
  /**
   * Applies transformation on an RDD[Vector].
   * <p>
   * @param data RDD[Vector] to be transformed.
   * @return transformed RDD[Vector].
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data) ;
}
