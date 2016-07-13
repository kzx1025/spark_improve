# Apache Spark - 个人优化版

- 优化点: 在SparkContext遍历RDD链时判断是否在该stage有缓存RDD的操作，针对缓存操作有无重新分配shuffle操作和cache操作
可用最大内存的比例。
- 效果: 在一些典型应用中，一些没有cache操作的stage因为增加了shuffle操作的内存性能可以提高25%左右。

Spark is a fast and general cluster computing system for Big Data. It provides
high-level APIs in Scala, Java, and Python, and an optimized engine that
supports general computation graphs for data analysis. It also supports a
rich set of higher-level tools including Spark SQL for SQL and structured
data processing, MLLib for machine learning, GraphX for graph processing,
and Spark Streaming.

<http://spark.apache.org/>


