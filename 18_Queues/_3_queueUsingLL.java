public class _3_queueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            return;
        }

        public static int remove() {
            if(isEmpty()) return -1;
            int front = head.data;
            if(head == tail){
                //single element
                head = tail = null;
            } else {
                //multiple element
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if(isEmpty()) return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(10);
        q.add(11);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
