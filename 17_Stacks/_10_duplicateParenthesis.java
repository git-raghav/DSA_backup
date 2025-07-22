import java.util.Stack;

public class _10_duplicateParenthesis {
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            //if current element is a opening bracket
            if(ch == '(') stack.push(')');
            else if(ch == '{') stack.push('}');
            else if(ch == '[') stack.push(']');

            //if there were no openeing bracket so stack is empty or current element is closing bracket
            else if(stack.isEmpty() || ch != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({})[";
        System.out.println(isValid(str));
    }
}
