
public class _1_bubbleSort {
    public static void bsort(int arr[]) {
        boolean swapped;// to check if the array is already sorted or not
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {// swap this condition for descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;// iska matlab swapping hui h or array phele se sorted nhi h
                }
            }
            if (swapped == false) {
                // agar swapping nahi hui 1st turn m iska matlab array sorted h or aage check krne ki zarurat nahi h or loop se break kardo
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 48, 0, 6, 1, 8, 4 };
        bsort(arr);
    }
}
