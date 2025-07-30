import java.util.*;
public class _7_firstNonRepeating {

    //approach 1
    public static int app1(String str) {
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch - 'a'] == 1) return i;
        }
        return -1;
    }

    //approach 2
    public static int app2(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){ // Remove non-unique characters from the front of the queue as we want first unique, thats why we checking only for peek
                q.remove();
            }
        }
        return q.isEmpty()? -1 : str.indexOf(q.peek());

    }

    public static void main(String[] args) {
        String str = "eetcode";
        // System.out.println(app1(str));
        System.out.println(app2(str));
    }
}
