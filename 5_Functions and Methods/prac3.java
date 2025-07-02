import java.util.*;

class prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int num = sc.nextInt();
        if (num == reverse(num)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        sc.close();
    }

    public static int reverse(int num) {
        int rev = 0;
        int lastDigit = 0;
        while (num > 0) {
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }
        return rev;
    }
}
