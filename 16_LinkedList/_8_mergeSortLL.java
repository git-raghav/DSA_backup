import org.w3c.dom.Node;

public class _8_mergeSortLL {
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

    public void print(Node head) {
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

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next; // first middle in case of even number of nodes.

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // first middle
    }

    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null) return head;

        //find mid
        Node mid = getMid(head);

        //left and right halves mergesort
        Node rightHead = mid.next; // right half starts after mid
        mid.next = null; // break the list into two halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public Node merge(Node head1, Node head2){
        //step 1 initialization
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        // Step 2: Compare nodes from both lists and attach the smaller one
        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        //Step 3 if element remains in any ll
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        //Step 4: Return the merged list, skipping the dummy node
        return mergedLL.next;
    }

    public static void main(String[] args) {
        _8_mergeSortLL ll = new _8_mergeSortLL();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print(head);
        head = ll.mergeSort(head);
        ll.print(head);
    }
}
