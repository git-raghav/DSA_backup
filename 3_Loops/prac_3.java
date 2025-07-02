
// Factorial
import java.util.*;

class prac_3 {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int num = sc.nextInt();
        for (int i = num; i >= 2; i--) {
            fact *= i;
        }
        System.out.println("factorial of the input no. is " + fact);
        sc.close();
    }
}
