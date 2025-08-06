import java.util.*;
public class _24_duplicateSubtrees {
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

    public static ArrayList<Integer> find(Node root) {

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.right.left = new Node(2);
        root.right.right = new Node(4);
        System.out.println(find(root));
    }
}
