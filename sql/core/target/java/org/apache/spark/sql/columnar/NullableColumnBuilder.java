package org.apache.spark.sql.columnar;
/**
 * A stackable trait used for building byte buffer for a column containing null values.  Memory
 * layout of the final byte buffer is:
 * <pre><code>
 *    .----------------------- Column type ID (4 bytes)
 *    |   .------------------- Null count N (4 bytes)
 *    |   |   .--------------- Null positions (4 x N bytes, empty if null count is zero)
 *    |   |   |     .--------- Non-null elements
 *    V   V   V     V
 *   +---+---+-----+---------+
 *   |   |   | ... | ... ... |
 *   +---+---+-----+---------+
 * </code></pre>
 */
private abstract interface NullableColumnBuilder extends org.apache.spark.sql.columnar.ColumnBuilder {
  protected  java.nio.ByteBuffer nulls () ;
  protected  int nullCount () ;
  private  int pos () ;
  public  void initialize (int initialSize, java.lang.String columnName, boolean useCompression) ;
  public  void appendFrom (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) ;
  public  java.nio.ByteBuffer build () ;
  protected  java.nio.ByteBuffer buildNonNulls () ;
}
