public class _11_occurences {
    public static void print(int idx, int key, int arr[], String str) {
        if (idx == arr.length) {
            System.out.println(str);
            return;
        }
        if(arr[idx] == key) str += idx + " ";
        print(idx+1, key, arr, str);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        print(0, 2, arr, "");
    }
}
