import java.util.*;

class prac_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 nos");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (float) (a + b + c) / 3;
        System.out.println("average is=" + avg);
        sc.close();
    }
}
