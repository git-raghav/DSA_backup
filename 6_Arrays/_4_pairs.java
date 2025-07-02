public class _4_pairs {
    public static void pair(int arr[]) {
        int tp = 0;//total pairs
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        pair(arr);
    }
}
