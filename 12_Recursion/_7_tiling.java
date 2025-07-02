public class _7_tiling {
    public static int tilingProb(int n) { //2 x n
        if(n == 0 || n == 1) return 1; //base case
        int vertical = tilingProb(n-1); //vertical choice
        int horizontal = tilingProb(n-2); //horizontal choice
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        System.out.println(tilingProb(4));
    }
}
