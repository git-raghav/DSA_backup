import java.util.*;
public class _16_kthLevel {
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

    //iterative way, Level order traversal
    public static void print1(Node root, int k) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        int level = 0;

        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            level++;
            for (int i = 0; i < count; i++) {
                Node curr = q.remove();
                if(level == k) System.out.print(curr.data + " "); //change, add only first

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    //recursive way, Level order traversal
    public static void print2(Node root, int lvl, int k) {
        if(root == null) return;
        if(lvl == k){
            System.out.print(root.data + " ");
            return;
        }
        print2(root.left, lvl+1, k);
        print2(root.right, lvl+1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        print1(root, 3);
        System.out.println();
        print2(root, 1, 3);
    }
}
