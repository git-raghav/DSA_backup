class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i = arr.length-1; i >= 0; i--){
            int num = arr[i];
            arr[i] = max;
            max = Math.max(max, num);
        }
        return arr;
    }
}
// Input: arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]
// different from next greater element problem(stack)
