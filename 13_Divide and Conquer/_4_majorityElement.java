import java.util.*;

public class _4_majorityElement {

    public static int sortWay(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    //bayer-moore voting algo
    public static int bayerMoore(int arr[]) {
        int count = 0;
        int candidate = 0;

        for(int i = 0; i < arr.length; i++){
            if(count == 0) candidate = arr[i]; // jab bhi count 0 hoga tab candidate badal dena h
            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1};
        System.out.println(sortWay(arr));
        System.out.println(bayerMoore(arr));
    }
}
