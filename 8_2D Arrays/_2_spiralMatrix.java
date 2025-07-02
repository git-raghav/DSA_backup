public class _2_spiralMatrix {

    public static void spiral(int matrix[][]) {
        // remember figure to write algo
        int srow = 0;
        int scol = 0;
        int erow = matrix.length - 1;
        int ecol = matrix[0].length - 1;
        while (srow <= erow && scol <= ecol) {
            // top
            for (int j = scol; j <= ecol; j++) {
                System.out.print(matrix[srow][j] + " ");
            }
            // right
            for (int i = srow + 1; i <= erow; i++) {
                System.out.print(matrix[i][ecol] + " ");
            }
            // bottom
            for (int j = ecol - 1; j >= scol; j--) {
                if (srow == erow) {
                    break;
                }
                System.out.print(matrix[erow][j] + " ");
            }
            // left
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol) {
                    break;
                }
                System.out.print(matrix[i][scol] + " ");
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiral(matrix);
    }
}
