public class _5_gridWays {
    public static int grid(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        int way1 = grid(i + 1, j, n, m); // down choice
        int way2 = grid(i, j + 1, n, m); // right choice
        return way1 + way2; // total ways
    }

    public static void main(String[] args) {
        int n = 2, m = 2;
        System.out.println(grid(0, 0, n, m));
    }
}
