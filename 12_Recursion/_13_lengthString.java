public class _13_lengthString {
    public static int length(String str, int length) {
        if(str.length() == 0) return length;

        return length(str.substring(1), length + 1);//string ko ek character se chota karo or length+1 krdo sabse last m for e empty string send karega but +1 toh hoga
    }

    public static void main(String[] args) {
        System.out.println(length("abcde", 0));
    }
}
