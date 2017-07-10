import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nagyza on 2017.07.10..
 */
public class SizedDiagonalMatrixTest {
  @Test
  public void createMatrixSize3() throws Exception {
    int[] row0 = {1, 0, 0};
    int[] row1 = {0, 1, 0};
    int[] row2 = {0, 0, 1};
    int[][] matrix = {row0, row1, row2};
    assertEquals(matrix, SizedDiagonalMatrix.createMatrix(3));
  }

  @Test
  public void createRowFirstRowSize3() throws Exception {
    int[] row = {1, 0, 0};
    assertEquals(row, SizedDiagonalMatrix.createRow(3, 1));
  }
}