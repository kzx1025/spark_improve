#/bin/sh
rsync -av --progress  assembly/target/scala-2.10/spark-assembly-1.1.0-hadoop2.6.0.jar  -e ssh kzx@211.69.198.208:~/Applications/spark-1.1.0/assembly/target/scala-2.10/
#scp  assembly/target/scala-2.10/spark-assembly-1.1.0-hadoop2.6.0.jar  kzx@211.69.198.208:~/Applications/spark-1.1.0/assembly/target/scala-2.10/
