public class _1_mergeSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) return; //base case

        int mid = start + (end - start) / 2; //mid calc and this method so that for big arrays memory doesnt overflow
        mergeSort(arr, start, mid); //left part ko divide krke sort karega
        mergeSort(arr, mid + 1, end); //right part ko divide krke sort karega
        merge(arr, start, mid, end); //merge karega left aur right ko
    }

    public static void merge(int arr[], int start, int mid, int end) {
        //initialization
        int temp[] = new int[end-start+1]; //eg 3 size array(0-2) then 2-0+1=3
        int i = start; // Pointer for left half
        int j = mid+1; // Pointer for right half
        int k = 0; // Pointer for temp array

        // Compare elements in left and right half and place the smallest element in the temp array
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) { //change sign for descending
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //if elements remain in any half
        // agar left m element bachgaye
        while(i <= mid){
            temp[k] = arr[i];
            i++; k++;
        }
        // agar right m element bachgaye
        while(j <= end){
            temp[k] = arr[j];
            j++; k++;
        }

        //copy temp to original array
        //i=start isliye kyuki start is original index
        for(k=0, i=start; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
