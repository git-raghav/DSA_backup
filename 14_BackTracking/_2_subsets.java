public class _2_subsets {

    public static void subsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        //yes choice
        subsets(str, ans + str.charAt(i), i+1);
        //no choice
        subsets(str, ans, i+1);
    }

    public static void main(String[] args) {
        subsets("abc", "", 0);
    }
}
