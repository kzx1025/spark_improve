package org.apache.spark.mllib.random;
// no position
/**
 * :: Experimental ::
 * Generator methods for creating RDDs comprised of i.i.d. samples from some distribution.
 */
public  class RandomRDDs$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomRDDs$ MODULE$ = null;
  public   RandomRDDs$ () { throw new RuntimeException(); }
  /**
   * Generates an RDD comprised of i.i.d. samples from the uniform distribution <code>U(0.0, 1.0)</code>.
   * <p>
   * To transform the distribution in the generated RDD from <code>U(0.0, 1.0)</code> to <code>U(a, b)</code>, use
   * <code>RandomRDDs.uniformRDD(sc, n, p, seed).map(v => a + (b - a) * v)</code>.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ <code>U(0.0, 1.0)</code>.
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> uniformRDD (org.apache.spark.SparkContext sc, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#uniformRDD}.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD uniformJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#uniformJavaRDD} with the default seed.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD uniformJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#uniformJavaRDD} with the default number of partitions and the default seed.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD uniformJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size) { throw new RuntimeException(); }
  /**
   * Generates an RDD comprised of i.i.d. samples from the standard normal distribution.
   * <p>
   * To transform the distribution in the generated RDD from standard normal to some other normal
   * <code>N(mean, sigma^2^)</code>, use <code>RandomRDDs.normalRDD(sc, n, p, seed).map(v => mean + sigma * v)</code>.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ N(0.0, 1.0).
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> normalRDD (org.apache.spark.SparkContext sc, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#normalRDD}.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD normalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#normalJavaRDD} with the default seed.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD normalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#normalJavaRDD} with the default number of partitions and the default seed.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD normalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size) { throw new RuntimeException(); }
  /**
   * Generates an RDD comprised of i.i.d. samples from the Poisson distribution with the input mean.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param mean Mean, or lambda, for the Poisson distribution.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ Pois(mean).
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> poissonRDD (org.apache.spark.SparkContext sc, double mean, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#poissonRDD}.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD poissonJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#poissonJavaRDD} with the default seed.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD poissonJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#poissonJavaRDD} with the default number of partitions and the default seed.
   */
  public  org.apache.spark.api.java.JavaDoubleRDD poissonJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size) { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Generates an RDD comprised of i.i.d. samples produced by the input RandomDataGenerator.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param generator RandomDataGenerator used to populate the RDD.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples produced by generator.
   */
  public <T extends java.lang.Object> org.apache.spark.rdd.RDD<T> randomRDD (org.apache.spark.SparkContext sc, org.apache.spark.mllib.random.RandomDataGenerator<T> generator, long size, int numPartitions, long seed, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from the
   * uniform distribution on <code>U(0.0, 1.0)</code>.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD.
   * @param seed Seed for the RNG that generates the seed for the generator in each partition.
   * @return RDD[Vector] with vectors containing i.i.d samples ~ <code>U(0.0, 1.0)</code>.
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> uniformVectorRDD (org.apache.spark.SparkContext sc, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#uniformVectorRDD}.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> uniformJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#uniformJavaVectorRDD} with the default seed.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> uniformJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#uniformJavaVectorRDD} with the default number of partitions and the default seed.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> uniformJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from the
   * standard normal distribution.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples ~ <code>N(0.0, 1.0)</code>.
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> normalVectorRDD (org.apache.spark.SparkContext sc, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#normalVectorRDD}.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#normalJavaVectorRDD} with the default seed.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#normalJavaVectorRDD} with the default number of partitions and the default seed.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from the
   * Poisson distribution with the input mean.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param mean Mean, or lambda, for the Poisson distribution.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>)
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples ~ Pois(mean).
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> poissonVectorRDD (org.apache.spark.SparkContext sc, double mean, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#poissonVectorRDD}.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> poissonJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#poissonJavaVectorRDD} with the default seed.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> poissonJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#poissonJavaVectorRDD} with the default number of partitions and the default seed.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> poissonJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Generates an RDD[Vector] with vectors containing i.i.d. samples produced by the
   * input RandomDataGenerator.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param generator RandomDataGenerator used to populate the RDD.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples produced by generator.
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> randomVectorRDD (org.apache.spark.SparkContext sc, org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> generator, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Returns <code>numPartitions</code> if it is positive, or <code>sc.defaultParallelism</code> otherwise.
   */
  private  int numPartitionsOrDefault (org.apache.spark.SparkContext sc, int numPartitions) { throw new RuntimeException(); }
}
