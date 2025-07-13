public class _2_Search {
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

    //using iterative method
    public int itrSearch(int key) {
        int i = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //using recursive method
    public int recSearch(Node head, int key) {
        //base cases
        if(head == null) return -1;
        if(head.data == key) return 0;

        int idx = recSearch(head.next, key); // recursive part
        if(idx == -1) return -1;
        return idx+1;
    }

    public static void main(String[] args) {
        _2_Search ll = new _2_Search();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println("Element found at " + ll.itrSearch(3));
        System.out.println("Element found at " + ll.recSearch(head, 3));
    }
}
