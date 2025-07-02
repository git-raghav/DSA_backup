import java.util.*;

class prac_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil, pen, eraser respectively");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float bill = total + (0.18f * total);
        System.out.println("your bill amount is " + bill);
        sc.close();
    }
}
