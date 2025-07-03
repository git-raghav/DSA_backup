public class _5_inversionCount {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int invCount = 0;

    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
                // While merging two sorted halves:
                // If arr[i] > arr[j], then all elements from arr[i] to arr[mid] will form inversions with arr[j]
                // because left and right halves are already sorted
                //if jth element is greater than ith element then automatically all elements after i will be greater
                invCount += mid - i + 1;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(k=0, i=start; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2,4,1,3,5 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Inversion count = " + invCount);
        printArray(arr);
    }
}
