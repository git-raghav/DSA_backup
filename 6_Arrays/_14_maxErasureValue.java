public class _14_maxErasureValue {
    public static void main(String[] args) {
        int nums[] = { 4, 2, 4, 5, 6 };
        int maxsum = 0, currentSum = 0, start = 0;
        boolean[] isPresent = new boolean[10001];

        for (int end = 0; end < nums.length; end++) {
            while (isPresent[nums[end]]) {
                isPresent[nums[start]] = false;
                currentSum -= nums[start];
                start++;
            }

            isPresent[nums[end]] = true;
            currentSum += nums[end];

            maxsum = Math.max(maxsum, currentSum);
        }
        System.out.println(maxsum);
    }
}
