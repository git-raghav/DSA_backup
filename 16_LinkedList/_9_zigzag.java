public class _9_zigzag {
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

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next; // first middle in case of even number of nodes.

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // first middle
    }

    public void zigZag(){
        //find mid
        Node mid = getMid(head);

        //2nd half reverse
        Node prev = null;
        Node curr = mid.next;
        mid.next = null; //1st half k last element ko bhi null point karvado

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head; //left head
        Node right = prev; //right head

        //alternate merging
        Node nextLeft, nextRight;
        while (left != null && right != null) {
            //simulation
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;
            
            //updation
            left = nextLeft;
            right = nextRight;
        }
    }

    public static void main(String[] args) {
        _9_zigzag ll = new _9_zigzag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
