public class _10_binaryStrings {
    public static void print(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if(lastPlace==0) { // Last digit was 0 → we can place either 0 or 1
            print(n - 1, 0, str+"0"); //places 0 and updates lastplace to 0
            print(n - 1, 1, str+"1"); //places 1 and updates lastplace to 1
        } else {
            print(n - 1, 0, str+"0"); // Last digit was 1 → we can only place 0
        }
    }

    public static void main(String[] args) {
        print(3, 0, "");
    }
}
