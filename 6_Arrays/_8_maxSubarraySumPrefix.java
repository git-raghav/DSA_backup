import java.util.*;

public class _8_maxSubarraySumPrefix {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        sub(arr);
    }

    public static void sub(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        System.out.println("max sum= " + maxsum);
    }
}
// public class subarraysSumPrefix {

//     public static void sub(int arr[]) {
//         int sum = 0;
//         int max = Integer.MIN_VALUE;
//         //creating a prefix array
//         int prefix[] = new int[arr.length];
//         prefix[0] = arr[0];
//         //storing subarray sum in prefix array
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + arr[i];//current sum = previous sum + new no.
//         }
//         //going through every subarray
//         for (int i = 0; i < arr.length; i++) {
//             int start = i;
//             for (int j = i; j < arr.length; j++) {
//                 int end = j;

//                 if (start == 0) {
//                     sum = prefix[end];
//                 } else {
//                     sum = prefix[end] - prefix[start - 1];//sum of current subarray will be end sum excluding the other no.s not in the subarray
//                 }
//             }
//             if (sum > max) {
//                 max = sum;
//             }
//         }
//         System.out.println(max);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, -2, 6, -1, 3 };
//         sub(arr);
//     }
// }