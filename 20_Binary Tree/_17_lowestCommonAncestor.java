import java.util.*;

import org.w3c.dom.Node;
public class _17_lowestCommonAncestor {
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

    public static Node lca(Node root, Node p, Node q) {
        if(root == null || root == p || root == q) return root; //agr nahi mili to null, agr p mili to p, agr q mili to q

        Node left = lca(root.left, p, q); //left m dhundo
        Node right = lca(root.right, p, q); //right m dhundo

        if(left != null && right != null) return root; //agr dono eksath mili to current call ka head
        return left != null ? left : right; // agr left mili to left, agr nahi mili to right
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(lca(root, root.left, root.left.right).data);
    }
}
