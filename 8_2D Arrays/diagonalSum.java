public class diagonalSum {

    public static void sum(int matrix[][]) {
        int sum = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        // approach 1-O(n^2)
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i + j == row - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // approach 2-O(n)
        for (int i = 0; i < row; i++) {
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != row - i - 1) {// overlap condition check
                sum += matrix[i][row - i - 1];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        sum(matrix);
    }
}
