import java.util.Stack;
public class _10_duplicateParenthesis {
    public static boolean duplicate(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //(, a ,b, ... sab ko push krte raho and jab ) aye toh kuch kaam karo
            if (ch == ')') {
                //agr ch m ) and stack k top p ( h toh iska matlab duplicasy h
                if (stack.peek() == '(') {
                    return true;
                } else {
                    //agr or koi elements h toh pop krte raho jab tak ( naa aajaye or usko bhi pop krdo
                    while (stack.peek() != '(') { //pop everything till (
                        stack.pop();
                    }
                    stack.pop();//extra pop to ( ko pop krne k liye
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "((a+b))";
        String str = "(a+b)";
        System.out.println(duplicate(str));
    }
}
