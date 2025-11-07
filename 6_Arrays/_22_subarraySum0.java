import java.util.*;
public class _22_subarraySum0 {
    static boolean check(int arr[]) {
        int prefix = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            if(prefix == 0 || set.contains(prefix)){
                return true;
            }
            set.add(prefix);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, -3, 1, 6 };
        System.out.println(check(arr));
    }
}
//we have to find whether there is a subarray with sum 0 or not
//approach is to use prefix sum and hashset

//prefix sum of 4, 2, -3, 1, 6 will be 4, 6, 3, 4, 10
//you can see that 4 comes twice that means there is a subarray between these two 4's which has sum 0 (4+0=4)
//if at any point prefix sum becomes 0 or if the prefix sum is already present in the hashset then we can say that there is a subarray with sum 0
