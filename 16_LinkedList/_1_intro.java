public class _1_intro {
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

    public void addFirst(int data) {
        // O(1)
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        return;
    }

    public void addLast(int data) {
        // O(1)
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
        // O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addMiddle(int idx, int data) {
        // O(n)
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            // idx-1 because jis idx p add krna h uske previous k previous execute hona
            // chahiye tab vo previous ko point karega
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return;
    }

    public int removeFirst() {
        if (head == null) {
            return -1;
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            return -1;
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int i = 0;
        Node temp = head;
        while (i < size - 2) {
            temp = temp.next;
            i++;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public static void main(String[] args) {
        _1_intro ll = new _1_intro();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.removeLast());
        // ll.print();
        // System.out.println(ll.size);
    }
}
