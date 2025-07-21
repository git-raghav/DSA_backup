import java.util.*;
public class _4_pushBottom {
    public static void pushB(Stack<Integer> stack, int data) {
        //base case when stack gets empty
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();//at every point store top
        pushB(stack, data);//pass reduced stack
        stack.push(top);//push top of that time again
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
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
