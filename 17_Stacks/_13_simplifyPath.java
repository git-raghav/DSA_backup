import java.util.Stack;
public class _13_simplifyPath {
    public static String simplify(String path) {
        Stack<String> stack = new Stack<>();
        String token[] = path.split("/"); // extract tokens

        for (int i = 0; i < token.length; i++) {
            if (token[i].equals(".") || token[i].equals("")) {
                continue;
            } else if (token[i].equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(token[i]);
            }
        }

        if (stack.isEmpty()) return "/";

        // returning in correct order
        String str = "";
        while (!stack.isEmpty()) {
            str = "/" + stack.pop() + str;
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "/a/./b/../..//c/";
        System.out.println(simplify(str));
    }
}
