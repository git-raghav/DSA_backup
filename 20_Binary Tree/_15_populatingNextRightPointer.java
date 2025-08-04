import java.util.*;

import org.w3c.dom.Node;
public class _15_populatingNextRightPointer {
    static class Node {
        int data;
        Node left;
        Node right;
        Node next;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.next = null;
        }
    }

    public Node connect(Node root) {
        if (root == null) return root; //edge case
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.remove(); //remove

                if (curr.left != null) { //add child
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }

                //new step
                if(i == count-1) curr.next = null; //level ka last element h toh null point
                else curr.next = q.peek(); //agr koi or h toh uske right sibling jo ki queue ka first element h usko point
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        connect(root);
    }
}
//dont run
