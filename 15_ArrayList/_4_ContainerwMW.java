import java.util.ArrayList;

public class _4_ContainerwMW {

    // Brute Force Approach O(n^2)
    public static int maxWaterBrute(ArrayList<Integer> height) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size() - 1; i++) { // try all pairs of heights
            for (int j = i + 1; j < height.size(); j++) {
                int currWater = Math.min(height.get(i), height.get(j)) * (j - i);// height * width
                max = Math.max(max, currWater);
            }
        }
        return max;
    }

    // 2 Pointer Approach O(n)
    public static int maxWaterPointer(ArrayList<Integer> height) {
        int max = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // calculate water
            int currWater = Math.min(height.get(lp), height.get(rp)) * (rp - lp);// height * width
            max = Math.max(max, currWater);

            // update pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(maxWaterBrute(height));
        System.out.println(maxWaterPointer(height));
    }
}
