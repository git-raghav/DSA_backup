import java.util.*;
public class _10_deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(30);
        dq.addLast(40);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
