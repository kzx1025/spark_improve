package org.apache.spark.streaming.dstream;
private  class FileInputDStream<K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> extends org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> {
  /**
   * A custom version of the DStreamCheckpointData that stores names of
   * Hadoop files as checkpoint data.
   */
  private  class FileInputDStreamCheckpointData extends org.apache.spark.streaming.dstream.DStreamCheckpointData<scala.Tuple2<K, V>> {
    public   FileInputDStreamCheckpointData () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String[]> hadoopFiles () { throw new RuntimeException(); }
    public  void update (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
    public  void cleanup (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
    public  void restore () { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  /**
   * Custom PathFilter class to find new files that
   * ... have modification time more than ignore time
   * ... have not been seen in the last interval
   * ... have modification time less than maxModTime
   */
  private  class CustomPathFilter implements org.apache.hadoop.fs.PathFilter {
    public   CustomPathFilter (long maxModTime) { throw new RuntimeException(); }
    public  long minNewFileModTime () { throw new RuntimeException(); }
    public  boolean accept (org.apache.hadoop.fs.Path path) { throw new RuntimeException(); }
  }
  static public  boolean defaultFilter (org.apache.hadoop.fs.Path path) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Ident(org), org.apache), org.apache.hadoop), org.apache.hadoop.mapreduce), [org.apache.hadoop.mapreduce.InputFormat aka newTypeName("NewInputFormat")]), List(TypeTree().setOriginal(Ident(newTypeName("K"))), TypeTree().setOriginal(Ident(newTypeName("V"))))))))
  public   FileInputDStream (org.apache.spark.streaming.StreamingContext ssc_, java.lang.String directory, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> filter, boolean newFilesOnly, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<F> evidence$3) { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.dstream.FileInputDStream<K, V, F>.FileInputDStreamCheckpointData checkpointData () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> lastFoundFiles () { throw new RuntimeException(); }
  private  long ignoreTime () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path path_ () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs_ () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String[]> files () { throw new RuntimeException(); }
  private  org.apache.spark.util.TimeStampedHashMap<java.lang.String, java.lang.Object> fileModTimes () { throw new RuntimeException(); }
  private  long lastNewFileFindingTime () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  /**
   * Finds the files that were modified since the last time this method was called and makes
   * a union RDD out of them. Note that this maintains the list of files that were processed
   * in the latest modification time in the previous call to this method. This is because the
   * modification time returned by the FileStatus API seems to return times only at the
   * granularity of seconds. And new files may have the same modification time as the
   * latest modification time in the previous call to this method yet was not reported in
   * the previous call.
   */
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, V>>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
  /** Clear the old time-to-files mappings along with old RDDs */
  protected  void clearMetadata (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /**
   * Find files which have modification timestamp <= current time and return a 3-tuple of
   * (new files found, latest modification time among them, files with latest modification time)
   */
  private  scala.Tuple2<scala.collection.Seq<java.lang.String>, java.lang.Object> findNewFiles (long currentTime) { throw new RuntimeException(); }
  /** Generate one RDD from an array of files */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> filesToRDD (scala.collection.Seq<java.lang.String> files) { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path directoryPath () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs () { throw new RuntimeException(); }
  private  long getFileModTime (org.apache.hadoop.fs.Path path) { throw new RuntimeException(); }
  private  void reset () { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream ois) { throw new RuntimeException(); }
}
