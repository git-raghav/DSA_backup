import java.util.*;
public class _21_univalued {
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

    //kind of preorder traversal
    public static boolean check(Node root) {
        if(root == null) return true;

        if(root.left != null && root.data != root.left.data) return false; //left child k saath check
        if(root.right != null && root.data != root.right.data) return false; //right child k saath check

        return check(root.left) && check(root.right); //agar sab sahi h toh niche valo k liye check karo
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        System.out.println(check(root));
    }
}
