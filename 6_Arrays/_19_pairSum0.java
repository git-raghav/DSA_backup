// Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
// Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.
import java.util.*;
public class _19_pairSum0 {
    private static ArrayList<ArrayList<Integer>> getPairs(int arr[]) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<String> seen = new HashSet<>();

        int lp = 0;
        int rp = arr.length - 1;
        while (lp < rp) {
            if(arr[lp] + arr[rp] == 0) {
                String pairKey = arr[lp] + "," + arr[rp];
                if(!seen.contains(pairKey)) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arr[lp]);
                    pair.add(arr[rp]);
                    result.add(pair);
                    seen.add(pairKey);
                }
                lp++;
                rp--;
            } else if(arr[lp] + arr[rp] < 0) {
                lp++;
            } else {
                rp--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(getPairs(arr));
    }
}
//normal pairsum question(2 pointers) but we cant return duplicate pairs so we use hashset to keep track of seen pairs
