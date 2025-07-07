// pair whose sum is equal to the target value
//arraylist is rotated and sorted
import java.util.ArrayList;

public class _6_pairSum_2 {

    // Brute Force Approach O(n^2)
    public static boolean pairSumBrute(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2 Pointer Approach O(n)
    public static boolean pairSumPointer(ArrayList<Integer> list, int target) {
        int pivot = -1;
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) { // finding array breaking point
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1;// will point the smallest element
        int rp = pivot;// will point the largets element
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 19;

        System.out.println(pairSumBrute(list, target));
        System.out.println(pairSumPointer(list, target));
    }
}
