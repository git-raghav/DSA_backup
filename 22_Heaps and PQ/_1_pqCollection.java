import java.util.*;
public class _1_pqCollection {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); //return element in ascending order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //return element in descending order
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
