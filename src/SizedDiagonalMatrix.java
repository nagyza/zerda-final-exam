
public class SizedDiagonalMatrix {

  public static void main(String[] args) {
    int size = 5;
    int[][] matrix = createMatrix(size);
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (j + 1 < size) {
          System.out.print(matrix[i][j]);
        } else {
          System.out.println(matrix[i][j]);
        }
      }
    }
  }

  public static int[][] createMatrix(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      int[] row = createRow(size, i + 1);
      matrix[i] = row;
    }
    return matrix;
  }

  public static int[] createRow(int size, int placeOfdiagonal) {
    int[] row = new int[size];
    for (int i = 0; i < size; i++) {
      if (i + 1 == placeOfdiagonal) {
        row[i] = 1;
      } else {
        row[i] = 0;
      }
    }
    return row;
  }
}
