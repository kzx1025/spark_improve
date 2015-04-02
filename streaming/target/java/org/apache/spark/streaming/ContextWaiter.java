package org.apache.spark.streaming;
private  class ContextWaiter {
  public   ContextWaiter () { throw new RuntimeException(); }
  private  java.lang.Throwable error () { throw new RuntimeException(); }
  private  boolean stopped () { throw new RuntimeException(); }
  public  void notifyError (java.lang.Throwable e) { throw new RuntimeException(); }
  public  void notifyStop () { throw new RuntimeException(); }
  public  void waitForStopOrError (long timeout) { throw new RuntimeException(); }
}
