public class _4_nthNodeFromEnd {
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

    // using iterative method
    //O(n)
    public void remove(int n) {
        //size calculate krlo traverse krke i++ krke yaa fir size variable
        if (head == null) {
            System.out.println("linked list empty");
            return;
        } else if (n == size) {
            head = head.next;
            return;
        }
        Node prev = head;
        int i = 1;
        while (i < size-n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        _4_nthNodeFromEnd ll = new _4_nthNodeFromEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.remove(3);
        ll.print();

    }
}
