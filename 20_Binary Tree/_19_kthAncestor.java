import java.util.*;
public class _19_kthAncestor {
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

    public static int ancestor(Node root, int node, int k) {
        if(root == null) return -1;
        if(root.data == node) return 0;

        int leftDist = ancestor(root.left, node, k);
        int rightDist = ancestor(root.right, node, k);

        if(leftDist == -1 && rightDist == -1) return -1;
        int max = Math.max(leftDist, rightDist);
        if(max+1 == k) System.out.println(root.data);
        return max+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ancestor(root, 5, 2);
    }
}
