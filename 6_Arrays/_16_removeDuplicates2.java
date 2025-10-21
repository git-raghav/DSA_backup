class _16_removeDuplicates2 {
    public static int removeDuplicates(int[] nums) {
        int lp = 2;
        for (int rp = 2; rp < nums.length; rp++) {
            if (nums[rp] != nums[lp - 2]) {
                nums[lp] = nums[rp];
                lp++;
            }
        }
        return lp;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,1,1,1,1,1,1,1,1,1,1};
        int index = removeDuplicates(nums);
        for(int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
