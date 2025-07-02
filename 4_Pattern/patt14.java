
public class patt14 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("- ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
// - - - - 1
// - - - 2 - 2
// - - 3 - 3 - 3
// - 4 - 4 - 4 - 4
// 5 - 5 - 5 - 5 - 5