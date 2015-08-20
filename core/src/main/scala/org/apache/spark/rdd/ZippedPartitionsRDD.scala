/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.rdd

import java.io.{IOException, ObjectOutputStream}

import org.apache.spark.scheduler.ShuffleMemorySignal

import scala.reflect.ClassTag

import org.apache.spark.{OneToOneDependency, Partition, SparkContext, TaskContext}

private[spark] class ZippedPartitionsPartition(
    idx: Int,
    @transient rdds: Seq[RDD[_]],
    @transient val preferredLocations: Seq[String])
  extends Partition {

  override val index: Int = idx
  var partitionValues = rdds.map(rdd => rdd.partitions(idx))
  def partitions = partitionValues

  @throws(classOf[IOException])
  private def writeObject(oos: ObjectOutputStream) {
    // Update the reference to parent split at the time of task serialization
    partitionValues = rdds.map(rdd => rdd.partitions(idx))
    oos.defaultWriteObject()
  }
}

private[spark] abstract class ZippedPartitionsBaseRDD[V: ClassTag](
    sc: SparkContext,
    var rdds: Seq[RDD[_]],
    preservesPartitioning: Boolean = false)
  extends RDD[V](sc, rdds.map(x => new OneToOneDependency(x))) {

  override val partitioner =
    if (preservesPartitioning) firstParent[Any].partitioner else None

  override def getPartitions: Array[Partition] = {
    val numParts = rdds.head.partitions.size
    if (!rdds.forall(rdd => rdd.partitions.size == numParts)) {
      throw new IllegalArgumentException("Can't zip RDDs with unequal numbers of partitions")
    }
    Array.tabulate[Partition](numParts) { i =>
      val prefs = rdds.map(rdd => rdd.preferredLocations(rdd.partitions(i)))
      // Check whether there are any hosts that match all RDDs; otherwise return the union
      val exactMatchLocations = prefs.reduce((x, y) => x.intersect(y))
      val locs = if (!exactMatchLocations.isEmpty) exactMatchLocations else prefs.flatten.distinct
      new ZippedPartitionsPartition(i, rdds, locs)
    }
  }

  override def getPreferredLocations(s: Partition): Seq[String] = {
    s.asInstanceOf[ZippedPartitionsPartition].preferredLocations
  }

  override def clearDependencies() {
    super.clearDependencies()
    rdds = null
  }
}

private[spark] class ZippedPartitionsRDD2[A: ClassTag, B: ClassTag, V: ClassTag](
    sc: SparkContext,
    f: (Iterator[A], Iterator[B]) => Iterator[V],
    var rdd1: RDD[A],
    var rdd2: RDD[B],
    preservesPartitioning: Boolean = false)
  extends ZippedPartitionsBaseRDD[V](sc, List(rdd1, rdd2), preservesPartitioning) {

  override def compute(s: Partition, context: TaskContext,shuffleMemorySignal :ShuffleMemorySignal): Iterator[V] = {
    val partitions = s.asInstanceOf[ZippedPartitionsPartition].partitions
    if(shuffleMemorySignal.getIsCache) {
      f(rdd1.iteratorK(partitions(0), context,shuffleMemorySignal), rdd2.iteratorK(partitions(1), context,shuffleMemorySignal))
    }else{
      f(rdd1.iteratorK(partitions(0), context,shuffleMemorySignal), rdd2.iteratorK(partitions(1), context,shuffleMemorySignal))
    }
  }

  override def clearDependencies() {
    super.clearDependencies()
    rdd1 = null
    rdd2 = null
  }
}

private[spark] class ZippedPartitionsRDD3
  [A: ClassTag, B: ClassTag, C: ClassTag, V: ClassTag](
    sc: SparkContext,
    f: (Iterator[A], Iterator[B], Iterator[C]) => Iterator[V],
    var rdd1: RDD[A],
    var rdd2: RDD[B],
    var rdd3: RDD[C],
    preservesPartitioning: Boolean = false)
  extends ZippedPartitionsBaseRDD[V](sc, List(rdd1, rdd2, rdd3), preservesPartitioning) {

  override def compute(s: Partition, context: TaskContext,shuffleMemorySignal :ShuffleMemorySignal): Iterator[V] = {
    val partitions = s.asInstanceOf[ZippedPartitionsPartition].partitions
    if(shuffleMemorySignal.getIsCache) {
      f(rdd1.iteratorK(partitions(0), context,shuffleMemorySignal),
        rdd2.iteratorK(partitions(1), context,shuffleMemorySignal),
        rdd3.iteratorK(partitions(2), context,shuffleMemorySignal))
    }else{
      f(rdd1.iteratorK(partitions(0), context,shuffleMemorySignal),
        rdd2.iteratorK(partitions(1), context,shuffleMemorySignal),
        rdd3.iteratorK(partitions(2), context,shuffleMemorySignal))
    }
  }

  override def clearDependencies() {
    super.clearDependencies()
    rdd1 = null
    rdd2 = null
    rdd3 = null
  }
}

private[spark] class ZippedPartitionsRDD4
  [A: ClassTag, B: ClassTag, C: ClassTag, D:ClassTag, V: ClassTag](
    sc: SparkContext,
    f: (Iterator[A], Iterator[B], Iterator[C], Iterator[D]) => Iterator[V],
    var rdd1: RDD[A],
    var rdd2: RDD[B],
    var rdd3: RDD[C],
    var rdd4: RDD[D],
    preservesPartitioning: Boolean = false)
  extends ZippedPartitionsBaseRDD[V](sc, List(rdd1, rdd2, rdd3, rdd4), preservesPartitioning) {

  override def compute(s: Partition, context: TaskContext,shuffleMemorySignal :ShuffleMemorySignal): Iterator[V] = {
    val partitions = s.asInstanceOf[ZippedPartitionsPartition].partitions
    if(shuffleMemorySignal.getIsCache) {
      f(rdd1.iteratorK(partitions(0), context,shuffleMemorySignal),
        rdd2.iteratorK(partitions(1), context,shuffleMemorySignal),
        rdd3.iteratorK(partitions(2), context,shuffleMemorySignal),
        rdd4.iteratorK(partitions(3), context,shuffleMemorySignal))
    }else{
      f(rdd1.iteratorK(partitions(0), context,shuffleMemorySignal),
        rdd2.iteratorK(partitions(1), context,shuffleMemorySignal),
        rdd3.iteratorK(partitions(2), context,shuffleMemorySignal),
        rdd4.iteratorK(partitions(3), context,shuffleMemorySignal))
    }
  }

  override def clearDependencies() {
    super.clearDependencies()
    rdd1 = null
    rdd2 = null
    rdd3 = null
    rdd4 = null
  }
}
