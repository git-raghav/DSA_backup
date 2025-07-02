public class _7_maxSubarraySumBrute {
    public static void sub(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;// har nayi subarray k liye vapis se zero
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum= " + maxsum);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        sub(arr);
    }
}
