// Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.
// Return true if such a triplet exists, otherwise, return false.
import java.util.*;
public class _24_tripletSumK {
    static boolean check(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int s = target - arr[i];
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if(arr[j] + arr[k] == s) {
                    return true;
                } else if (arr[j] + arr[k] < s) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 15;
        System.out.println(check(arr, target));
    }
}
