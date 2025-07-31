import java.util.LinkedList;
import java.util.Queue;

public class _5_levelOrderTraversal {
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
    static class BinaryTree {
        private int idx = -1;

        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        //levelorder traversal (RPA)
        public void levelOrder(Node root){
            if(root == null) return; //edge case

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int count = q.size();
                for(int i = 0; i < count; i++){
                    Node curr = q.remove(); //remove
                    System.out.print(curr.data + " "); //print

                    if(curr.left != null){ //add child
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);
    }
}
