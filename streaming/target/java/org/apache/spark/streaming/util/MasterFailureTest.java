package org.apache.spark.streaming.util;
// no position
private  class MasterFailureTest implements org.apache.spark.Logging {
  static public  boolean killed () { throw new RuntimeException(); }
  static public  int killCount () { throw new RuntimeException(); }
  static public  boolean setupCalled () { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static public  void testMap (java.lang.String directory, int numBatches, org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
  static public  void testUpdateStateByKey (java.lang.String directory, int numBatches, org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
  /**
   * Tests stream operation with multiple master failures, and verifies whether the
   * final set of output values is as expected or not.
   */
  static public <T extends java.lang.Object> scala.collection.Seq<T> testOperation (java.lang.String directory, org.apache.spark.streaming.Duration batchDuration, scala.collection.Seq<java.lang.String> input, scala.Function1<org.apache.spark.streaming.dstream.DStream<java.lang.String>, org.apache.spark.streaming.dstream.DStream<T>> operation, scala.collection.Seq<T> expectedOutput, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Sets up the stream computation with the given operation, directory (local or HDFS),
   * and batch duration. Returns the streaming context and the directory to which
   * files should be written for testing.
   */
  static private <T extends java.lang.Object> org.apache.spark.streaming.StreamingContext setupStreams (org.apache.spark.streaming.Duration batchDuration, scala.Function1<org.apache.spark.streaming.dstream.DStream<java.lang.String>, org.apache.spark.streaming.dstream.DStream<T>> operation, org.apache.hadoop.fs.Path checkpointDir, org.apache.hadoop.fs.Path testDir, scala.reflect.ClassTag<T> evidence$2) { throw new RuntimeException(); }
  /**
   * Repeatedly starts and kills the streaming context until timed out or
   * the last expected output is generated. Finally, return
   */
  static private <T extends java.lang.Object> scala.collection.Seq<T> runStreams (org.apache.spark.streaming.StreamingContext ssc_, T lastExpectedOutput, long maxTimeToRun, scala.reflect.ClassTag<T> evidence$3) { throw new RuntimeException(); }
  /**
   * Verifies the output value are the same as expected. Since failures can lead to
   * a batch being processed twice, a batches output may appear more than once
   * consecutively. To avoid getting confused with those, we eliminate consecutive
   * duplicate batch outputs of values from the <code>output</code>. As a result, the
   * expected output should not have consecutive batches with the same values as output.
   */
  static private <T extends java.lang.Object> void verifyOutput (scala.collection.Seq<T> output, scala.collection.Seq<T> expectedOutput, scala.reflect.ClassTag<T> evidence$4) { throw new RuntimeException(); }
  /** Resets counter to prepare for the test */
  static private  void reset () { throw new RuntimeException(); }
}
