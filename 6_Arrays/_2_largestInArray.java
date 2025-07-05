import java.util.*;

public class _2_largestInArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        System.out.println("largest in the array is " + largest(numbers));
        System.out.println("smallest in the array is " + smallest(numbers));
    }

    public static int largest(int numbers[]) {
        int max = Integer.MIN_VALUE; //java utility package
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int smallest(int numbers[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
//O(n)
