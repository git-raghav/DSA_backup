import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _13_generateBinary {

    //approach 1
    public static void app1(int n) {
        for (int i = 1; i <= 5; i++) {
            int num = i;
            int bin = 0;
            int rem = 0;
            int pow = 0;
            while (num > 0) {
                rem = num % 2;
                bin += rem * (int) Math.pow(10, pow++);
                num /= 2;
            }
            System.out.print(bin + " ");
        }
    }

    //approach 2 (binary tree level order RPA type approach)
    public static ArrayList<String> app2(int n) {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");
        for (int i = 1; i <= n; i++) {
            String temp = q.remove(); //remove

            ans.add(temp); //print

            q.add(temp+"0"); //add
            q.add(temp+"1");
        }
        return ans;
    }

    public static void main(String[] args) {
        // app1(5);
        System.out.println(app2(5));
    }
}
