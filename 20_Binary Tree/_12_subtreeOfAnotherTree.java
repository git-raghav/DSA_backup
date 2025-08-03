public class _12_subtreeOfAnotherTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isSubtree(Node root, Node subroot) { //preorder traversal
        if(root == null) return false;
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)) return true;
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static boolean isIdentical(Node p, Node q) { //same tree code
        if (p == null && q == null) return true;           // both null → match
        if (p == null || q == null) return false;          // one null → mismatch

        if (p.data != q.data) return false;                // values don’t match
        return isIdentical(p.left, q.left) && isIdentical(p.right, q.right); // recursively check left and right subtrees
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println(isSubtree(root, subroot));
    }
}
