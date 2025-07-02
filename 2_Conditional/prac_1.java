import java.util.*;

class prac_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        float num = sc.nextFloat();
        if (num > 0) {
            System.out.println("positve");
        } else if (num == 0) {
            System.out.println("neutral");
        } else {
            System.out.println("negative");
        }
        sc.close();
    }
}
