package org.apache.spark.streaming.util;
private  interface Clock {
  public abstract  long currentTime () ;
  public abstract  long waitTillTime (long targetTime) ;
}
