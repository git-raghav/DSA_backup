public class _3_permutation {
    public static void permutation(String str, String ans) {
        if(str.length() == 0){ //base case
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String nstr = str.substring(0,i) + str.substring(i+1); //remaining string ko lene k liye current character string se hatado
            permutation(nstr, ans + curr); //current char ko ans m add karo or baaki character ko bhejdo combination k liye
        }
    }

    public static void main(String[] args) {
        permutation("abc", "");
    }
}
//At each step, fix one character from the string, remove it, and recursively generate permutations of the remaining characters.Once the input string is empty, print the accumulated answer.
