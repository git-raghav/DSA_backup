public class _27_firstlastOccurence {
    private static int findIdx(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; //no overflow
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
    private static int[] occurrence(int[] arr, int key){
        int idx = findIdx(arr, key);
        if(idx == -1){
            return new int[]{-1, -1};
        }
        // expand to left and right till we have key
        int first = idx;
        int last = idx;
        while(first > 0 && arr[first - 1] == key){
            first--;
        }
        while(last < arr.length - 1 && arr[last + 1] == key){
            last++;
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 4, 4, 5, 6};
        int target = 4;
        int ans[] = occurrence(nums, target);
        System.out.println("First Occurrence of " + target + " is at index: " + ans[0]);
        System.out.println("Last Occurrence of " + target + " is at index: " + ans[1]);
    }
}
//first find element using binary search
//then expand to left and right to find first and last occurrence
