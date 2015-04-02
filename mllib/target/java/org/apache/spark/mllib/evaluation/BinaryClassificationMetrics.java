package org.apache.spark.mllib.evaluation;
/**
 * :: Experimental ::
 * Evaluator for binary classification.
 * <p>
 * @param scoreAndLabels an RDD of (score, label) pairs.
 */
public  class BinaryClassificationMetrics implements org.apache.spark.Logging {
  public   BinaryClassificationMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> scoreAndLabels) { throw new RuntimeException(); }
  /** Unpersist intermediate RDDs used in the computation. */
  public  void unpersist () { throw new RuntimeException(); }
  /** Returns thresholds in descending order. */
  public  org.apache.spark.rdd.RDD<java.lang.Object> thresholds () { throw new RuntimeException(); }
  /**
   * Returns the receiver operating characteristic (ROC) curve,
   * which is an RDD of (false positive rate, true positive rate)
   * with (0.0, 0.0) prepended and (1.0, 1.0) appended to it.
   * @see http://en.wikipedia.org/wiki/Receiver_operating_characteristic
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> roc () { throw new RuntimeException(); }
  /**
   * Computes the area under the receiver operating characteristic (ROC) curve.
   */
  public  double areaUnderROC () { throw new RuntimeException(); }
  /**
   * Returns the precision-recall curve, which is an RDD of (recall, precision),
   * NOT (precision, recall), with (0.0, 1.0) prepended to it.
   * @see http://en.wikipedia.org/wiki/Precision_and_recall
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> pr () { throw new RuntimeException(); }
  /**
   * Computes the area under the precision-recall curve.
   */
  public  double areaUnderPR () { throw new RuntimeException(); }
  /**
   * Returns the (threshold, F-Measure) curve.
   * @param beta the beta factor in F-Measure computation.
   * @return an RDD of (threshold, F-Measure) pairs.
   * @see http://en.wikipedia.org/wiki/F1_score
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> fMeasureByThreshold (double beta) { throw new RuntimeException(); }
  /** Returns the (threshold, F-Measure) curve with beta = 1.0. */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> fMeasureByThreshold () { throw new RuntimeException(); }
  /** Returns the (threshold, precision) curve. */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> precisionByThreshold () { throw new RuntimeException(); }
  /** Returns the (threshold, recall) curve. */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> recallByThreshold () { throw new RuntimeException(); }
  // not preceding
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter>> cumulativeCounts () { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.evaluation.binary.BinaryConfusionMatrix>> confusions () { throw new RuntimeException(); }
  /** Creates a curve of (threshold, metric). */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> createCurve (org.apache.spark.mllib.evaluation.binary.BinaryClassificationMetricComputer y) { throw new RuntimeException(); }
  /** Creates a curve of (metricX, metricY). */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> createCurve (org.apache.spark.mllib.evaluation.binary.BinaryClassificationMetricComputer x, org.apache.spark.mllib.evaluation.binary.BinaryClassificationMetricComputer y) { throw new RuntimeException(); }
}
