public class _14_startEndSame {
    public static int countHelper(String s, int start, int end) {
        // Base case: when start reaches end of string
        if (start == s.length()) return 0;

        // If end crosses string, move to next start
        if (end == s.length()) {
            return countHelper(s, start + 1, start + 1);
        }

        // Count this substring if start and end characters match
        int count = (s.charAt(start) == s.charAt(end)) ? 1 : 0;

        // Move end forward
        return count + countHelper(s, start, end + 1);
    }

    public static void main(String[] args) {
        String str = "abcab";
        System.out.print(countHelper(str, 0, 0));
    }
}
