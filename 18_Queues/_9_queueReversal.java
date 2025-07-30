import java.util.*;
public class _9_queueReversal {

    //approach 1 stack
    public static void rev1(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()) {
            q.add(stack.pop());
        }
        return;
    }

    //approach 2 recursion
    public static void rev2(Queue<Integer> q) {
        if(q.isEmpty()) return;
        int front = q.remove(); //store and remove
        rev2(q); //smaller queue k liye call
        q.add(front); //recursion unwind hote time vapis add krdo
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // rev1(q);
        rev2(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
