import java.util.*;
public class _9_balanceBST {
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

    public static ArrayList<Integer> list = new ArrayList<>(); //global arraylist

    public static Node balanceBST(Node root) {
        inOrder(root); //inorder traversal to convert bst to sorted arraylist
        return create(0, list.size() - 1);
    }

    // inorder traversal
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }

    // sorted arraylist ko bst code same as sorted array to bst
    public static Node create(int low, int high) {
        if (low > high) return null; //base case

        int mid = low + (high - low) / 2;
        Node root = new Node(list.get(mid)); //node create
        root.left = create(low, mid - 1); // left ki node banao
        root.right = create(mid + 1, high); // right ki node banao

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        balanceBST(root);
    }
}
// step 1- inorder se sorted arraylist banao
// step 2- arraylist se vapis se bst banao mid krke
