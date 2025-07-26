import java.util.*;

public class _12_distinctArray {
    public static boolean distinct(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(distinct(arr));
    }
}
//O(n^2)
//boolean array approach but O(n) space complexity and O(n) time complexity
