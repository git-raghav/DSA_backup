public class _11_sameTree {
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

    public static boolean check(Node p, Node q) {
        if (p == null && q == null) return true;           // both null → match
        if (p == null || q == null) return false;          // one null → mismatch

        if (p.data != q.data) return false;                // values don’t match
        return check(p.left, q.left) && check(p.right, q.right); // recursively check left and right subtrees
    }

    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);
        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);
        System.out.println(check(p, q));
    }
}
