public class _8_removeDuplicates {
    public static void check(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()){
            System.out.println(newStr);// Base case: full string processed
            return;
        }
        char currChar = str.charAt(idx);
        System.out.println("idx: " + idx + ", char: " + currChar + ", newStr: " + newStr);
        if(map[currChar-'a'] == true){ // Duplicate → skip this character
            check(str, idx+1, newStr, map);
        } else { // Not seen before → include this character
            map[currChar-'a'] = true; //true krdo
            check(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder sb = new StringBuilder("");
        boolean arr[] = new boolean[26];
        check(str, 0, sb, arr);
    }
}
