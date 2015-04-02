package org.apache.spark.graphx.impl;
/** A special shuffle serializer for AggregationMessage[Int]. */
private  class IntAggMsgSerializer extends org.apache.spark.serializer.Serializer implements scala.Serializable {
  public   IntAggMsgSerializer () { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerInstance newInstance () { throw new RuntimeException(); }
}
