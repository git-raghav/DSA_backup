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

    public static boolean check(Node p, Node q) {

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
