public class _4_nQueens {
    public static void print(char board[][]) {
        System.out.println("-----Chess Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nQueens(char board[][], int row) {
        if (row == board.length) { // base case
            print(board);
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) { // if current queen is safe from all above queens
                board[row][j] = 'Q'; // place the queen
                nQueens(board, row + 1); // recurse to place queens in next rows
                board[row][j] = '.';
                // backtracking step, when recursion returns, remove the queen kyuki next iteration(j++) m queen ko next col m daalna h or fir dubara combinations check karna h
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
        System.out.println("Total solutions: " + count);
    }
}
// 1. Try placing queen in every column of current row.
// 2. If safe → place → recurse to next row.
// 3. If row == N → print solution.
// 4. After recursion, remove queen (backtrack).
// 5. Continue trying next columns.
// 6. Repeat until all configurations are explored.
