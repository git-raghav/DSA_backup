public class _10_doublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
        return;
    }

    public void removeFirst() {
        if(head == null){
            return;
        } else if(head.next == null){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
        return;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if(head.next == null){
            System.out.println(head.data);
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        _10_doublyLL dll = new _10_doublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);
        dll.reverse();
        dll.print();
    }
}
