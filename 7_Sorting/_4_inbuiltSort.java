import java.util.*;
public class _4_inbuiltSort {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 48, 0, 6, 1, 8, 4, 4, 4, -1 };
        Integer newarr[] = { 2, 3, 48, 0, 6, 1, 8, 4, 4, 4, -1 };
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 4);
        Arrays.sort(newarr, Collections.reverseOrder());// works in Integer object
        // Arrays.sort(newarr, 0, 4, Collections.reverseOrder());

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
