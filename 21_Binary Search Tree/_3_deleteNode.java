public class _3_deleteNode {
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

    // inorder traversal
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node delete(Node root, int key) {
        if(root == null) return null; //base case ki key nhi mili

        if(key < root.data) {
            root.left = delete(root.left, key); //agr left m h toh delete krke return krdo
        }
        else if(key > root.data) {
            root.right = delete(root.right, key); //agr right m h toh delete krke return krdo
        }
        else {
            //case 1 leaf node no child
            if(root.left == null && root.right == null) return null;

            //case 2 one child
            if(root.left == null) return root.right; //dono k liye already check karchuke h, ab sirf ek k liye dekhenge
            else if(root.right == null) return root.left;

            //case 3 both child present
            Node node = findSuccessor(root.right); //successor right subtree m hoga to right subtree ka root bhejdo or dhundho
            root.data = node.data; //successor ki value se replace krdo current value
            root.right = delete(root.right, node.data); //successor node ko delete krdo
        }
        return root;
    }

    public static Node findSuccessor(Node node){
        while(node.left != null){ //leftmost node in right subtree hota h successor
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);
        delete(root, 2);
        inOrder(root);
    }
}
