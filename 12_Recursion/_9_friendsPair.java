public class _9_friendsPair {
    public static int ways(int n) {
        if(n == 1 || n == 2) return n; //base case
        int single = ways(n-1); //single choice
        int pair = (n-1) * ways(n-2); //pair choice
        return single + pair;
    }

    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
