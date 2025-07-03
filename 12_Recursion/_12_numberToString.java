public class _12_numberToString {
    public static void print(int num, String digits[]) {
        if(num == 0) return;

        int lastDigit = num%10;
        print(num /= 10, digits);
        System.out.print(digits[lastDigit]+" ");// function gets completed when it finds the last didgit that is our first digit thats why we have kept sopln at last
    }

    public static void main(String[] args) {
        String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        print(20101, digits);
    }
}
