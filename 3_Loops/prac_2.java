
// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.*;

class prac_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, choice;
        int evenSum = 0, oddSum = 0;
        do {
            System.out.println("enter no");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("press 1 to continue press any other no. to exit");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("odd no. sum is " + oddSum);
        System.out.println("even no. sum is " + evenSum);
        sc.close();
    }
}
