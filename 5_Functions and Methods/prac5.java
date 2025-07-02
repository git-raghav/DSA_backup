import java.util.*;

class prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int num = sc.nextInt();
        sum(num);
        sc.close();
    }

    public static void sum(int num) {
        int digitSum = 0;
        while (num > 0) {
            digitSum += num % 10;// ek hi baat h lastdigit ki jagha direct likh diya
            num /= 10;
        }
        System.out.println(digitSum);
    }
}
