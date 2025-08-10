public class _4_rangeSum {
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

    public static int sum = 0;

    public static int sum(Node root, int low, int high) {
        if(root == null) return sum; //Base case: if no node, nothing to add

        if(root.data >= low && root.data <= high){ //If current node's value is in range
            sum += root.data;
            sum(root.left, low, high);
            sum(root.right, low, high);
        }
        else if(root.data < low){ //If current node's value is too small
            sum(root.right, low, high);
        }
        else { //If current node's value is too large
            sum(root.left, low, high);
        }

        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println(sum(root, 3, 5));
    }
}
