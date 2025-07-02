public class ithbit {
    public static int getbit(int n, int i) {
        if ((n & (1 << i)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setbit(int n, int i) {
        int x = (n | (1 << i));
        return x;
    }

    public static int clearbit(int n, int i) {
        int x = (n & ~(1 << i));
        return x;
    }

    public static int updatebit(int n, int i, int bit) {
        // if (bit==0) {
        // return clearbit(n, i);
        // } else {
        // return setbit(n, i);
        // }
        n = clearbit(n, i);
        return n | (bit << i);
    }

    public static int clearIbits(int n, int i) {
        int x = (n & ((-1) << i));
        return x;
    }

    // public static int rangebits(int n, int i, int j) {
        
    // }

    public static void main(String[] args) {
        // System.out.println(getbit(10, 3));
        // System.out.println(setbit(10, 2));
        // System.out.println(clearbit(10, 1));
        // System.out.println(updatebit(10, 2, 1));
        // System.out.println(clearIbits(15, 2));
        // System.out.println(rangebits(15, 2, 0));
    }
}