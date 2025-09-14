public class _10_maxPathSum {
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

    static int sum = 0;
    public static int diam(Node root) {
        find(root);
        return sum;
    }
    public static int find(Node root) {
        if(root == null) return 0;

        int left = Math.max(0, find(root.left)); //we are using math.max to avoid negative values, they will just lower the value so we dont need it
        int right = Math.max(0, find(root.right));
        sum = Math.max(sum, left + right + root.data);
        
        return Math.max(left, right) + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(diam(root));
    }
}
