public class _3_fibonacci {
    public static int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fib(n));
    }
}
