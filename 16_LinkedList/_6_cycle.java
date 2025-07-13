import org.w3c.dom.Node;

public class _6_cycle {
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

    public boolean check() {
        // edge case
        if (head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public void removeCycle() {
        if (head == null || head.next == null) return; // edge case

        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) return;

        // find meeting point
        slow = head;

        // Edge case: cycle starts at head
        if (slow == fast) {
            // Move fast until its next is slow (i.e., end of cycle)
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null; // break the cycle
            return;
        }

        // general case
        Node prev = null;
        while (slow != fast) {
            slow = slow.next; // 1 step
            prev = fast;
            fast = fast.next; // 1 step
        }

        // remove cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        _6_cycle ll = new _6_cycle();
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(5);
        ll.addLast(5);
        // tail.next = head.next;
        tail.next = head;

        System.out.println(ll.check());
        ll.removeCycle();
        System.out.println(ll.check());
        ll.print();
    }
}
