import java.util.*;
public class _14_rev1stKelements {

    public static void rev(Queue<Integer> q, int k){
        int size = q.size(); //size-k = elements that dont need to be reversed
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < k; i++){ //remove k elements from queue and push in stack
            s.push(q.remove());
        }
        while(!s.isEmpty()){ //add elements to the back of queue from stack
            q.add(s.pop());
        }
        for(int i = 0; i < size-k; i++){ //add remaining elements from front to the back
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        rev(q, 5);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
