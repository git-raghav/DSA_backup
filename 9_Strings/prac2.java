// Write a program to check whether two strings are anagram or not.
// An anagram of a string is another string that contains the same characters, only the order of characters can be different.
// For example, “act” and “cat” are an anagram of each other.
import java.util.*;

public class prac2 {
    public static boolean anagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            return Arrays.equals(sChars, tChars);
        } else
            return false;
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(anagram(str1, str2));
    }
}
