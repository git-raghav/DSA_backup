public class _3_insertionSort {
    public static void ssort(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Traverse the array
            int j = i; // Start checking from the current element
            while (j > 0 && arr[j - 1] > arr[j]) { // Compare with the previous element
                // If the previous element is greater, swap them
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--; // Move left to continue checking
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 48, 0, 6, 1, 8, 4, 4, 4, -1 };
        ssort(arr);
    }
}
