package org.apache.spark.streaming.flume.sink;
/**
 * Copy of the org.apache.spark.Logging for being used in the Spark Sink.
 * The org.apache.spark.Logging is not used so that all of Spark is not brought
 * in as a dependency.
 */
private abstract interface Logging {
  static private  boolean initialized () { throw new RuntimeException(); }
  static public  java.lang.Object initLock () { throw new RuntimeException(); }
  private  org.slf4j.Logger log_ () ;
  protected  org.slf4j.Logger log () ;
  protected  void logInfo (scala.Function0<java.lang.String> msg) ;
  protected  void logDebug (scala.Function0<java.lang.String> msg) ;
  protected  void logTrace (scala.Function0<java.lang.String> msg) ;
  protected  void logWarning (scala.Function0<java.lang.String> msg) ;
  protected  void logError (scala.Function0<java.lang.String> msg) ;
  protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  protected  boolean isTraceEnabled () ;
  private  void initializeIfNecessary () ;
  private  void initializeLogging () ;
}
