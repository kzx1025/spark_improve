package org.apache.spark.mllib.api.python;
/**
 * :: DeveloperApi ::
 * The Java stubs necessary for the Python mllib bindings.
 * <p>
 * See python/pyspark/mllib/_common.py for the mutually agreed upon data format.
 */
public  class PythonMLLibAPI implements scala.Serializable {
  public   PythonMLLibAPI () { throw new RuntimeException(); }
  /**
   * Loads and serializes labeled points saved with <code>RDD#saveAsTextFile</code>.
   * @param jsc Java SparkContext
   * @param path file or directory path in any Hadoop-supported file system URI
   * @param minPartitions min number of partitions
   * @return serialized labeled points stored in a JavaRDD of byte array
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> loadLabeledPoints (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.String path, int minPartitions) { throw new RuntimeException(); }
  private  java.util.LinkedList<java.lang.Object> trainRegressionModel (scala.Function2<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.regression.GeneralizedLinearModel> trainFunc, org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, byte[] initialWeightsBA) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LinearRegressionWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainLinearRegressionModelWithSGD (org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, int numIterations, double stepSize, double miniBatchFraction, byte[] initialWeightsBA, double regParam, java.lang.String regType, boolean intercept) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LassoWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainLassoModelWithSGD (org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, int numIterations, double stepSize, double regParam, double miniBatchFraction, byte[] initialWeightsBA) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RidgeRegressionWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainRidgeModelWithSGD (org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, int numIterations, double stepSize, double regParam, double miniBatchFraction, byte[] initialWeightsBA) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib SVMWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainSVMModelWithSGD (org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, int numIterations, double stepSize, double regParam, double miniBatchFraction, byte[] initialWeightsBA, java.lang.String regType, boolean intercept) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LogisticRegressionWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainLogisticRegressionModelWithSGD (org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, int numIterations, double stepSize, double miniBatchFraction, byte[] initialWeightsBA, double regParam, java.lang.String regType, boolean intercept) { throw new RuntimeException(); }
  /**
   * Java stub for NaiveBayes.train()
   */
  public  java.util.List<java.lang.Object> trainNaiveBayes (org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, double lambda) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib KMeans.train()
   */
  public  java.util.List<java.lang.Object> trainKMeansModel (org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, int k, int maxIterations, int runs, java.lang.String initializationMode) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib ALS.train().  This stub returns a handle
   * to the Java object instead of the content of the Java object.  Extra care
   * needs to be taken in the Python code to ensure it gets freed on exit; see
   * the Py4J documentation.
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainALSModel (org.apache.spark.api.java.JavaRDD<byte[]> ratingsBytesJRDD, int rank, int iterations, double lambda, int blocks) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib ALS.trainImplicit().  This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicitALSModel (org.apache.spark.api.java.JavaRDD<byte[]> ratingsBytesJRDD, int rank, int iterations, double lambda, int blocks, double alpha) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib DecisionTree.train().
   * This stub returns a handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on exit;
   * see the Py4J documentation.
   * @param dataBytesJRDD  Training data
   * @param categoricalFeaturesInfoJMap  Categorical features info, as Java map
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainDecisionTreeModel (org.apache.spark.api.java.JavaRDD<byte[]> dataBytesJRDD, java.lang.String algoStr, int numClasses, java.util.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfoJMap, java.lang.String impurityStr, int maxDepth, int maxBins) { throw new RuntimeException(); }
  /**
   * Predict the label of the given data point.
   * This is a Java stub for python DecisionTreeModel.predict()
   * <p>
   * @param featuresBytes Serialized feature vector for data point
   * @return predicted label
   */
  public  double predictDecisionTreeModel (org.apache.spark.mllib.tree.model.DecisionTreeModel model, byte[] featuresBytes) { throw new RuntimeException(); }
  /**
   * Predict the labels of the given data points.
   * This is a Java stub for python DecisionTreeModel.predict()
   * <p>
   * @param dataJRDD A JavaRDD with serialized feature vectors
   * @return JavaRDD of serialized predictions
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> predictDecisionTreeModel (org.apache.spark.mllib.tree.model.DecisionTreeModel model, org.apache.spark.api.java.JavaRDD<byte[]> dataJRDD) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.colStats(X: RDD[Vector]).
   * TODO figure out return type.
   */
  public  org.apache.spark.mllib.api.python.MultivariateStatisticalSummarySerialized colStats (org.apache.spark.api.java.JavaRDD<byte[]> X) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.corr(X: RDD[Vector], method: String).
   * Returns the correlation matrix serialized into a byte array understood by deserializers in
   * pyspark.
   */
  public  byte[] corr (org.apache.spark.api.java.JavaRDD<byte[]> X, java.lang.String method) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.corr(x: RDD[Double], y: RDD[Double], method: String).
   */
  public  double corr (org.apache.spark.api.java.JavaRDD<byte[]> x, org.apache.spark.api.java.JavaRDD<byte[]> y, java.lang.String method) { throw new RuntimeException(); }
  private  java.lang.String getCorrNameOrDefault (java.lang.String method) { throw new RuntimeException(); }
  private  long getSeedOrDefault (java.lang.Long seed) { throw new RuntimeException(); }
  private  int getNumPartitionsOrDefault (java.lang.Integer numPartitions, org.apache.spark.api.java.JavaSparkContext jsc) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.uniformRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> uniformRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.normalRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> normalRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.poissonRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> poissonRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.uniformVectorRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> uniformVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.normalVectorRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> normalVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.poissonVectorRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> poissonVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
}
