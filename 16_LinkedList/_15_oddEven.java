public class _15_oddEven {
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

    public void oddEven() {
        //edge case
        if(head == null || head.next == null) return;

        //initialization
        Node odd = head;
        Node even = head.next;
        Node evenHead = even; //to save first even head, we are not saving first odd head as head already points to it

        //make odd indices point to odd and even to even
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }

        //assign even list after oddlist
        odd.next = evenHead;
    }

    public static void main(String[] args) {
        _15_oddEven ll = new _15_oddEven();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        ll.oddEven();
        ll.print();
    }
}
