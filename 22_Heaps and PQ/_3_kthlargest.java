class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            min.add(nums[i]);
            if(min.size() > k){
                min.poll();
            }
        }
        return min.poll();
    }
}
// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
//use TreeSet for distinct case
