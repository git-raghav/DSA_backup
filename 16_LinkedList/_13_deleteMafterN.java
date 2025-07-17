import org.w3c.dom.Node;

public class _13_deleteMafterN {
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

    public void delete(int m, int n) {
    Node current = head;

    while (current != null) {
        //Step 1: Skip M nodes
        for (int i = 1; i < m && current != null; i++) {
            current = current.next;
        }

        //If we reached end while skipping M, break
        if (current == null) return;

        //Step 2: Delete next N nodes
        Node temp = current.next;
        for (int i = 0; i < n && temp != null; i++) {
            temp = temp.next;
        }

        //Step 3: Connect M-th node to (M+N+1)-th node
        current.next = temp;

        //Move current to next block of M
        current = temp;
    }
}

    public static void main(String[] args) {
        _13_deleteMafterN ll = new _13_deleteMafterN();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.print();
        ll.delete(3, 2);
        ll.print();
    }
}
