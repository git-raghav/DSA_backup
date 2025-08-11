public class _7_sortedArrayToBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length - 1);
    }
    public static Node create(int nums[], int low, int high) {
        if (low > high) return null; //base case

        int mid = low + (high - low) / 2;
        Node root = new Node(nums[mid]); //node create
        root.left = create(nums, low, mid - 1); // left ki node banao
        root.right = create(nums, mid + 1, high); // right ki node banao

        return root;
    }

    public static void main(String[] args) {
        int nums[] = { -10, -3, 0, 5, 9 };
        System.out.println(sortedArrayToBST(nums).data);
    }
}
