
public class SizedDiagonalMatrix {

  public static void main(String[] args) {

  }

  public static int[][] createMatrix(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {

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
