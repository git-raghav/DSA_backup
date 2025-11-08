// Given a string str, your task is to find the length of the smallest window that contains all the characters of the given string at least once.
// Input: str = "aabcbcdbca"
// Output: 4
// Explanation: Sub-String "dbca" has the smallest length that contains all the characters of str.
import java.util.*;
public class SmallestDistinctWindow {
    private static int smallestWindow(String str) {
        //store all unique characters
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        HashMap<Character, Integer> map = new HashMap<>();//stores character + frequency of current window
        int i = 0, j = 0, ans = Integer.MAX_VALUE;
        while (j < str.length()) {
            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
            if(map.size() == set.size()){
                while(map.get(str.charAt(i)) > 1){
                    map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) - 1);
                    i++;
                }
                ans = Math.min(ans, j - i + 1);
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(smallestWindow(str));
    }
}
