package org.apache.spark.repl;
/**
 *  Machinery for the asynchronous initialization of the repl.
 */
public abstract interface SparkILoopInit {
  /** Print a welcome message */
  public  void printWelcome () ;
  protected  void asyncMessage (java.lang.String msg) ;
  private  java.util.concurrent.locks.ReentrantLock initLock () ;
  private  java.util.concurrent.locks.Condition initCompilerCondition () ;
  private  java.util.concurrent.locks.Condition initLoopCondition () ;
  private  long initStart () ;
  private <T extends java.lang.Object> T withLock (scala.Function0<T> body) ;
  private  boolean initIsComplete () ;
  private  java.lang.String initError () ;
  private  java.lang.String elapsed () ;
  protected  void initializedCallback () ;
  protected  java.util.concurrent.Future<scala.runtime.BoxedUnit> createAsyncListener () ;
  protected  boolean awaitInitialized () ;
  protected  scala.collection.immutable.List<scala.Function0<scala.runtime.BoxedUnit>> postInitThunks () ;
  protected  void postInitialization () ;
  public  void initializeSpark () ;
  private  scala.collection.immutable.List<scala.Function0<scala.runtime.BoxedUnit>> pendingThunks () ;
  protected  void addThunk (scala.Function0<scala.runtime.BoxedUnit> body) ;
  protected  void runThunks () ;
}
