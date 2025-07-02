import java.util.*;

class largest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 nos");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("greatest is " + a);
        } else if (b > c) {
            System.out.println("greatest is " + b);
        } else {
            System.out.println("greatest is " + c);
        }
        sc.close();
    }
}
