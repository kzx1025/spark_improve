package org.apache.spark.mllib.api.python;
/**
 * :: DeveloperApi ::
 * MultivariateStatisticalSummary with Vector fields serialized.
 */
public  class MultivariateStatisticalSummarySerialized implements scala.Serializable {
  public  org.apache.spark.mllib.stat.MultivariateStatisticalSummary summary () { throw new RuntimeException(); }
  // not preceding
  public   MultivariateStatisticalSummarySerialized (org.apache.spark.mllib.stat.MultivariateStatisticalSummary summary) { throw new RuntimeException(); }
  public  byte[] mean () { throw new RuntimeException(); }
  public  byte[] variance () { throw new RuntimeException(); }
  public  long count () { throw new RuntimeException(); }
  public  byte[] numNonzeros () { throw new RuntimeException(); }
  public  byte[] max () { throw new RuntimeException(); }
  public  byte[] min () { throw new RuntimeException(); }
}
