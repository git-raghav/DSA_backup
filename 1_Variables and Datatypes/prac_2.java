import java.util.*;

class prac_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of the square");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("area of square is 5" + area);
        sc.close();
    }
}
