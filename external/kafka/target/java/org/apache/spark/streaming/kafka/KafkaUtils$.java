package org.apache.spark.streaming.kafka;
// no position
public  class KafkaUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KafkaUtils$ MODULE$ = null;
  public   KafkaUtils$ () { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages from a Kafka Broker.
   * @param ssc       StreamingContext object
   * @param zkQuorum  Zookeeper quorum (hostname:port,hostname:port,..)
   * @param groupId   The group id for this consumer
   * @param topics    Map of (topic_name -> numPartitions) to consume. Each partition is consumed
   *                  in its own thread
   * @param storageLevel  Storage level to use for storing the received objects
   *                      (default: StorageLevel.MEMORY_AND_DISK_SER_2)
   */
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<java.lang.String, java.lang.String>> createStream (org.apache.spark.streaming.StreamingContext ssc, java.lang.String zkQuorum, java.lang.String groupId, scala.collection.immutable.Map<java.lang.String, java.lang.Object> topics, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages from a Kafka Broker.
   * @param ssc         StreamingContext object
   * @param kafkaParams Map of kafka configuration parameters,
   *                    see http://kafka.apache.org/08/configuration.html
   * @param topics      Map of (topic_name -> numPartitions) to consume. Each partition is consumed
   *                    in its own thread.
   * @param storageLevel Storage level to use for storing the received objects
   */
  public <K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<?>, T extends kafka.serializer.Decoder<?>> org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<K, V>> createStream (org.apache.spark.streaming.StreamingContext ssc, scala.collection.immutable.Map<java.lang.String, java.lang.String> kafkaParams, scala.collection.immutable.Map<java.lang.String, java.lang.Object> topics, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<U> evidence$3, scala.reflect.ClassTag<T> evidence$4) { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages form a Kafka Broker.
   * Storage level of the data will be the default StorageLevel.MEMORY_AND_DISK_SER_2.
   * @param jssc      JavaStreamingContext object
   * @param zkQuorum  Zookeeper quorum (hostname:port,hostname:port,..)
   * @param groupId   The group id for this consumer
   * @param topics    Map of (topic_name -> numPartitions) to consume. Each partition is consumed
   *                  in its own thread
   */
  public  org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<java.lang.String, java.lang.String> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String zkQuorum, java.lang.String groupId, java.util.Map<java.lang.String, java.lang.Integer> topics) { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages form a Kafka Broker.
   * @param jssc      JavaStreamingContext object
   * @param zkQuorum  Zookeeper quorum (hostname:port,hostname:port,..).
   * @param groupId   The group id for this consumer.
   * @param topics    Map of (topic_name -> numPartitions) to consume. Each partition is consumed
   *                  in its own thread.
   * @param storageLevel RDD storage level.
   * <p>
   */
  public  org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<java.lang.String, java.lang.String> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.String zkQuorum, java.lang.String groupId, java.util.Map<java.lang.String, java.lang.Integer> topics, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Create an input stream that pulls messages form a Kafka Broker.
   * @param jssc      JavaStreamingContext object
   * @param keyTypeClass Key type of RDD
   * @param valueTypeClass value type of RDD
   * @param keyDecoderClass Type of kafka key decoder
   * @param valueDecoderClass Type of kafka value decoder
   * @param kafkaParams Map of kafka configuration parameters,
   *                    see http://kafka.apache.org/08/configuration.html
   * @param topics  Map of (topic_name -> numPartitions) to consume. Each partition is consumed
   *                in its own thread
   * @param storageLevel RDD storage level.
   */
  public <K extends java.lang.Object, V extends java.lang.Object, U extends kafka.serializer.Decoder<?>, T extends kafka.serializer.Decoder<?>> org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<K, V> createStream (org.apache.spark.streaming.api.java.JavaStreamingContext jssc, java.lang.Class<K> keyTypeClass, java.lang.Class<V> valueTypeClass, java.lang.Class<U> keyDecoderClass, java.lang.Class<T> valueDecoderClass, java.util.Map<java.lang.String, java.lang.String> kafkaParams, java.util.Map<java.lang.String, java.lang.Integer> topics, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
}
