import java.util.*;
public class _5_rootLeafPaths {
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

    public static ArrayList<String> binaryTreePaths(Node root) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        paths(root, sb, result);
        return result;
    }

    public static void paths(Node root, StringBuilder path, ArrayList<String> result) {
        if (root == null) return; // Base case: no node, stop recursion

        int len = path.length(); // Save current length of path (for backtracking later)
        if (len > 0) path.append("->");
        path.append(root.data);

        if (root.left == null && root.right == null) { //If it's a leaf node
            result.add(path.toString());
        } else {
            paths(root.left, path, result);
            paths(root.right, path, result);
        }
        path.setLength(len); // Backtrack: remove the part we added for the current node
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println(binaryTreePaths(root));
    }
}
