import java.util.*;
public class _23_deleteLeaves {
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

    //preorder traversal
    public static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node delete(Node root, int k) {
        if(root == null) return null;

        root.left = delete(root.left, k);
        root.right = delete(root.right, k);

        if(root.data == k && root.left == null && root.right == null) return null;
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        // root.right = new Node(1);
        root.left.left = new Node(1);
        // root.right.left = new Node(2);
        // root.right.right = new Node(4);
        delete(root, 1);
        preOrder(root);
    }
}
