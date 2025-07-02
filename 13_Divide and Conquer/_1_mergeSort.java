public class _1_mergeSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid); //left part ko divide krke sort karega
        mergeSort(arr, mid + 1, end); //right part ko divide krke sort karega
        merge(arr, start, mid, end); //merge karega left aur right ko
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
    }
}
