package org.apache.spark.mllib.linalg;
/**
 * Represents a numeric vector, whose index type is Int and value type is Double.
 * <p>
 * Note: Users should not implement this interface.
 */
public abstract interface Vector extends scala.Serializable {
  /**
   * Size of the vector.
   */
  public abstract  int size () ;
  /**
   * Converts the instance to a double array.
   */
  public abstract  double[] toArray () ;
  public  boolean equals (Object other) ;
  public  int hashCode () ;
  /**
   * Converts the instance to a breeze vector.
   */
  private abstract  breeze.linalg.Vector<java.lang.Object> toBreeze () ;
  /**
   * Gets the value of the ith element.
   * @param i index
   */
  public  double apply (int i) ;
  /**
   * Makes a deep copy of this vector.
   */
  public  org.apache.spark.mllib.linalg.Vector copy () ;
}
