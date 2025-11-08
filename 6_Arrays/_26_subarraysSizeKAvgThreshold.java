class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int result = 0;
        while(j < arr.length){
            int ws = j-i+1;
            sum += arr[j];
            if(ws == k){
                if(sum/k >= threshold) result++;
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return result;
    }
}
// Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
// Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
// Output: 3
// Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
