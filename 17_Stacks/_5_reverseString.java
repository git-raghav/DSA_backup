import java.util.*;
public class _5_reverseString {
    public static String rev(String str) {
        //push element in the stack
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            stack.push(str.charAt(idx));
            idx++;
        }
        //store element back as poping results in reverse order
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(rev("abc"));
    }
}
