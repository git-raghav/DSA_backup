import java.util.*;

public class _10_trappingRainwater {
    public static void main(String[] args) {
        int height[] = { 3, 4, 5, 6, 7, 8 };
        System.out.println("trapped water = " + calc(height));
    }

    public static int calc(int height[]) {
        int h = height.length;
        // calculate left max boundary
        int leftmax[] = new int[h];
        leftmax[0] = height[0];
        for (int i = 1; i < h; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        // calculate right max boundary
        int rightmax[] = new int[h];
        rightmax[h - 1] = height[h - 1];
        for (int i = h - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }

        // calculating trapped water
        int trapped = 0;
        for (int i = 0; i < h; i++) {
            // min(leftmax bound, rightmax bound)
            int waterlvl = Math.min(leftmax[i], rightmax[i]);
            trapped += waterlvl - height[i];
        }

        return trapped;
    }
}