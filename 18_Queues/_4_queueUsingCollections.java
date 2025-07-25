import java.util.*;
public class _4_queueUsingCollections {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //queue is a interface, another way is ArrayDeque
        // Queue<Integer> q = new ArrayDeque<>();
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
