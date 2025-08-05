import java.util.*;

import org.w3c.dom.Node;
public class _18_minDistanceNodes {
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

    public static int dist(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2); //find lca
        int dist1 = lcaDist(lca, n1); //distance between lca and n1
        int dist2 = lcaDist(lca, n2); //distance between lca and n2
        return dist1 + dist2; //add both distance
    }

    public static Node lca(Node root, int p, int q) {
        if(root == null || root.data == p || root.data == q) return root;

        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);

        if(left != null && right != null) return root;
        return left != null ? left : right;
    }

    public static int lcaDist(Node root, int n) {
        if(root.data == n) return 0;
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(dist(root, 4, 6));
    }
}
