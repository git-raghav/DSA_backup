import java.util.*;
public class _5_reverseString {
    public static void pushB(Stack<Integer> stack, int data) {

    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushB(stack, 4);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
