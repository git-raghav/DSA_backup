public class _6_sudoku {
    public static void print(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if(row == sudoku.length){
            return true;
        }

        // ek no. place krne k baad where to place next
        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == sudoku.length) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // only check where there are 0
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // recursion
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // place the no.
                if (sudokuSolver(sudoku, nextRow, nextCol)) { // soln exists and also calls func to place next no.
                    return true;
                }
                sudoku[row][col] = 0; //
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //col check
        for(int i=0; i<9; i++){
            if(sudoku[i][col] == digit) return false;
        }

        //row check
        for(int j=0; j<9; j++){
            if(sudoku[row][j] == digit) return false;
        }

        //3x3 grid check
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr; i<=sr+2; i++){
            for(int j = sc; j<=sc+2; j++){
                if(sudoku[i][j] == digit) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Soln Exists");
            print(sudoku);
        } else {
            System.out.println("Soln doesnt exists");
        }
    }
}
