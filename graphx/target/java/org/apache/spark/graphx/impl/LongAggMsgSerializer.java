package org.apache.spark.graphx.impl;
/** A special shuffle serializer for AggregationMessage[Long]. */
private  class LongAggMsgSerializer extends org.apache.spark.serializer.Serializer implements scala.Serializable {
  public   LongAggMsgSerializer () { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerInstance newInstance () { throw new RuntimeException(); }
}
