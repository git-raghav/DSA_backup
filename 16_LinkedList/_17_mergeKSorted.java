public class _17_mergeKSorted {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
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

    public static Node merge(Node list1, Node list2) {
        // initialization
        Node mergedList = new Node(-1);
        Node temp = mergedList;

        // compare and merge
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        // if any element remains
        while (list1 != null) {
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }

        return mergedList.next;
    }

    public static void main(String[] args) {
        _17_mergeKSorted ll1 = new _17_mergeKSorted();
        _17_mergeKSorted ll2 = new _17_mergeKSorted();

        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(4);

        ll2.addLast(1);
        ll2.addLast(3);
        ll2.addLast(4);

        System.out.print("List 1: ");
        ll1.print();

        System.out.print("List 2: ");
        ll2.print();

        // Merge and print the result
        Node mergedHead = merge(ll1.head, ll2.head);

        System.out.print("Merged List: ");
        Node temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
