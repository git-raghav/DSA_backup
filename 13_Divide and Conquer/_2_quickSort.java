public class _2_quickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) return; //base case

        int idx = partition(arr, start, end); //returns pivot index and sorts
        quickSort(arr, start, idx-1); //left part
        quickSort(arr, idx+1, end); //right part
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end]; //last ko pivot banadiya
        int i = start-1; //i start se phele

        for(int j = start; j < end; j++){ //puri array jo ayi h use traverse krdo
            if(arr[j] <= pivot){ //change the symbol for descending. agr current element chota ya equal h toh i++ krke swap krdo
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;// this will give where pivot should be
        //swap pivot to its correct position
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
