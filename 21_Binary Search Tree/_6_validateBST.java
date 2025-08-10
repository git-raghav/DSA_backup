public class _6_validateBST {
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

    public static boolean check(Node root, int min, int max) {
        if(root == null) return true; //base case

        if(root.data <= min || root.data >= max) return false; //check if in range
        return check(root.left, min, root.data) && check(root.right, root.data, max); //we are sending differnet min max according to the case, call for left and right subtree
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println(check(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
