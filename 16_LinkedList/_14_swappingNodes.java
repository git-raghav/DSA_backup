import org.w3c.dom.Node;

public class _14_swappingNodes {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void swap(int k) {
        //edge cases emptylist, one element, same node, k bigger then list
        if(head == null || head.next == null) return;
        if(k > size || k == size-k+1) return;

        //step 1: initialize
        Node dummy = new Node(0);//avoids special handling for head
        dummy.next = head;
        Node prevLeft = dummy;
        Node left = head;
        Node prevRight = dummy;
        Node right = head;

        //step 2: find the k-th node and kth last node
        for(int i = 1; i < k; i++){
            prevLeft = prevLeft.next;
            left = left.next;
        }
        for(int i = 1; i < size-k+1; i++){
            prevRight = prevRight.next;
            right = right.next;
        }

        //step 3 swapping
        //case 1 left is rights previous
        if(left == prevRight){
            left.next = right.next;
            prevLeft.next = right;
            right.next = left;
        } else if(right == prevLeft){ //case 2 right is lefts previous
            right.next = left.next;
            prevRight.next = left;
            left.next = right;
        } else { //normal cases not adjacent
            Node temp = left.next;
            prevLeft.next = right;
            left.next = right.next;
            prevRight.next = left;
            right.next = temp;
        }

        //step 4 update head
        head = dummy.next;
    }

    public static void main(String[] args) {
        _14_swappingNodes ll = new _14_swappingNodes();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        // ll.addLast(5);
        ll.print();
        ll.swap(1);
        ll.print();
    }
}
