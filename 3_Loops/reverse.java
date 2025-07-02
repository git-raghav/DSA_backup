import java.util.*;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int num = sc.nextInt();
        int rev = 0;
        int lastdigit = 0;
        while (num > 0) {
            lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num /= 10;
        }
        System.out.println("reverse of the no. is " + rev);
        sc.close();
    }
}
