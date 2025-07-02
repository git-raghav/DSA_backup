public class _5_occurence {
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) return -1;
        if(key == arr[i]) return i;
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if(i == -1) return -1;
        if(key == arr[i]) return i;
        return firstOccurence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2};
        System.out.println(firstOccurence(arr, 11, 0));
        System.out.println(lastOccurence(arr, 2, arr.length - 1));
    }
}
