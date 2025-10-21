public class _17_rotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k is greater than n
        reverse(nums, 0, n - 1); // step 1 complete array reverse
        reverse(nums, 0, k - 1); // step 2 first k elements reverse
        reverse(nums, k, n - 1); // step 3 remaining elements reverse except 1st k
    }

    private static void reverse(int[] nums, int lp, int rp) {
        while (lp < rp) {
            int temp = nums[lp];
            nums[lp] = nums[rp];
            nums[rp] = temp;
            lp++;
            rp--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 8;
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
