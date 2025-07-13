public class _3_reverse {
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
    // O(n)
    public void rev() {
        Node prev = null;
        Node curr = head;
        Node next;
        tail = head;

        while(curr != null){
            next = curr.next;//saving link
            curr.next = prev;// reversing link
            //updation
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        _3_reverse ll = new _3_reverse();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.rev();
        ll.print();
    }
}
