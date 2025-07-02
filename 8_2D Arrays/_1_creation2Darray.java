import java.util.*;

public class _1_creation2Darray {

    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        row = sc.nextInt();
        System.out.println("enter no. of columns");
        col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("enter details");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");// min max or key element check condition to be inserted here
            }
            System.out.println();
        }
        sc.close();
    }
}
