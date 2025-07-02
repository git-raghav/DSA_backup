public class _1_decreasing {
    public static void printDecreasing(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        // printDecreasing(n);
        printIncreasing(n);
    }
}
