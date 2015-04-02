package org.apache.spark.graphx.impl;
/** A special shuffle serializer for AggregationMessage[Double]. */
private  class DoubleAggMsgSerializer extends org.apache.spark.serializer.Serializer implements scala.Serializable {
  public   DoubleAggMsgSerializer () { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerInstance newInstance () { throw new RuntimeException(); }
}
