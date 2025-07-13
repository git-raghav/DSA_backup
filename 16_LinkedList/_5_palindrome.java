import org.w3c.dom.Node;

public class _5_palindrome {
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
        } else if (head == tail) {
            System.out.println(head.data);
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head) {
        // slow fast approach or turtle heir approach
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is at the middle node
    }

    public boolean check() {
        // edge case
        if (head == null || head.next == null) {
            return true;
        }

        // step 1- find midnode
        Node midNode = findMid(head);

        // step 2- reverse 2nd half
        Node prev = null;
        Node curr = midNode;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right head
        Node left = head; //left head

        // step 3- check both halves
        while (right != null) {
            if(left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        _5_palindrome ll = new _5_palindrome();
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addLast(1);

        ll.print();
        System.out.println(ll.check());
    }
}
