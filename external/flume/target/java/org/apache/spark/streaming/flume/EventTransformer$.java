package org.apache.spark.streaming.flume;
// no position
/**
 * A simple object that provides the implementation of readExternal and writeExternal for both
 * the wrapper classes for Flume-style Events.
 */
private  class EventTransformer$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventTransformer$ MODULE$ = null;
  public   EventTransformer$ () { throw new RuntimeException(); }
  public  scala.Tuple2<java.util.HashMap<java.lang.CharSequence, java.lang.CharSequence>, byte[]> readExternal (java.io.ObjectInput in) { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out, java.util.Map<java.lang.CharSequence, java.lang.CharSequence> headers, byte[] body) { throw new RuntimeException(); }
}