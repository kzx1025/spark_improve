package org.apache.spark.scheduler

import scala.collection.immutable.HashMap

/**
 * record this stage is have rdd cache or not,and its remainMemory
 * Created by iceke on 15/5/3.
 */
private[spark] class ShuffleMemorySignal(isRDDCache: Boolean,cacheMemory: Long)extends Serializable{
   private var isCache = isRDDCache
   private var cacheMem = cacheMemory
  private var stageId = 0
  private var executorName = ""
  var cacheRDDMap = new HashMap[String,Long]

  def setIsCache(isRDDCache: Boolean): Unit ={
    this.isCache = isRDDCache
  }

  def setCacheMemory(cacheMemory: Long): Unit ={
    this.cacheMem = cacheMemory
  }

  def getIsCache: Boolean ={
    this.isCache
  }

  def getCacheMemory: Long ={
    this.cacheMem
  }

  def setStageId(stageId: Int): Unit={
    this.stageId = stageId
  }

  def getStageId:Int ={
    this.stageId
  }

  def setExecutorName(executorName:String):Unit={
    this.executorName = executorName
  }

  def getExecutorName():String={
    this.executorName
  }

}
