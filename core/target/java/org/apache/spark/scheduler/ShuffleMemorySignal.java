package org.apache.spark.scheduler;
/**
 * record this stage is have rdd cache or not,and its remainMemory
 * Created by iceke on 15/5/3.
 */
private  class ShuffleMemorySignal implements scala.Serializable {
  public   ShuffleMemorySignal (boolean isRDDCache, long cacheMemory) { throw new RuntimeException(); }
  private  boolean isCache () { throw new RuntimeException(); }
  private  long cacheMem () { throw new RuntimeException(); }
  private  int stageId () { throw new RuntimeException(); }
  private  java.lang.String executorName () { throw new RuntimeException(); }
  public  scala.collection.immutable.HashMap<java.lang.String, java.lang.Object> cacheRDDMap () { throw new RuntimeException(); }
  public  void setIsCache (boolean isRDDCache) { throw new RuntimeException(); }
  public  void setCacheMemory (long cacheMemory) { throw new RuntimeException(); }
  public  boolean getIsCache () { throw new RuntimeException(); }
  public  long getCacheMemory () { throw new RuntimeException(); }
  public  void setStageId (int stageId) { throw new RuntimeException(); }
  public  int getStageId () { throw new RuntimeException(); }
  public  void setExecutorName (java.lang.String executorName) { throw new RuntimeException(); }
  public  java.lang.String getExecutorName () { throw new RuntimeException(); }
}
