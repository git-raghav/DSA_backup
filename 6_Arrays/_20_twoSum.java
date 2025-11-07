import java.util.*;
public class _20_twoSum {
    private static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(numToIndex.containsKey(target - numbers[i])) {
                return new int[] { numToIndex.get(target - numbers[i]), i };
            }
            numToIndex.put(numbers[i], i);
        }
        return new int[] { -1, -1 }; // No solution found
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
//2 elements that sum to target, we have to return their indices. thats why we cant sort and use 2 pointers
