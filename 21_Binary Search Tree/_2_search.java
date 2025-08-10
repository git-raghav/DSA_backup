public class _2_search {
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

    public static Node search(Node root, int key) {
        if(root == null || root.data == key) return root; //base case

        if(key < root.data) return search(root.left, key); //recursively search in left and right subtree based on condition
        else return search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println(search(root, 9));
    }
}
