import java.util.*;

class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three nos");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        avg(num1, num2, num3);
        sc.close();
    }

    public static void avg(float num1, float num2, float num3) {
        float average = (num1 + num2 + num3) / 3;
        System.out.println(average);
    }
}
