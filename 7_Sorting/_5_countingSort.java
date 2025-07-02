//used when range of no, is small
public class _5_countingSort {
    public static void ssort(int arr[]) {

        // first find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // create a count array
        int count[] = new int[largest + 1];

        // store the count of each element in count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) { //for (int i = count.length-1; i >= 0; i--)
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 9, 7, 5, 6, 2, 4, 8, 10, 2, 4, 3, 2 };
        ssort(arr);
    }
}
