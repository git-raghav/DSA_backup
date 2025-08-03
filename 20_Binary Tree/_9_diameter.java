public class _9_diameter {
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

    static int max = 0;
    public static int diam(Node root) {
        findHeight(root);
        return max; //for edges do -1
    }
    public static int findHeight(Node root) {
        if(root == null) return 0;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        // path through this node = left + right + 1
        max = Math.max(max, leftHeight + rightHeight + 1);

        // return height of this node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diam(root));
    }
}
