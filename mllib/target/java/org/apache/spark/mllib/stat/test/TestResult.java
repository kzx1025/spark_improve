package org.apache.spark.mllib.stat.test;
/**
 * :: Experimental ::
 * Trait for hypothesis test results.
 * @tparam DF Return type of <code>degreesOfFreedom</code>.
 */
public abstract interface TestResult<DF extends java.lang.Object> {
  /**
   * The probability of obtaining a test statistic result at least as extreme as the one that was
   * actually observed, assuming that the null hypothesis is true.
   */
  public abstract  double pValue () ;
  /**
   * Returns the degree(s) of freedom of the hypothesis test.
   * Return type should be Number(e.g. Int, Double) or tuples of Numbers for toString compatibility.
   */
  public abstract  DF degreesOfFreedom () ;
  /**
   * Test statistic.
   */
  public abstract  double statistic () ;
  /**
   * Null hypothesis of the test.
   */
  public abstract  java.lang.String nullHypothesis () ;
  /**
   * String explaining the hypothesis test result.
   * Specific classes implementing this trait should override this method to output test-specific
   * information.
   */
  public  java.lang.String toString () ;
}
