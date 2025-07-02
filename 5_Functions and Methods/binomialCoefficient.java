import java.util.*;

class binomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n and r respectively");
        int n = sc.nextInt();
        int r = sc.nextInt();

        float ans = binomial(n, r);
        System.out.println("binomial is " + ans);

        sc.close();
    }

    public static float binomial(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nr_fact=factorial(n-r);
        float ans=n_fact/(r_fact*nr_fact);
        return ans;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
