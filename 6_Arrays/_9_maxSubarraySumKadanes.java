import java.util.*;

public class _9_maxSubarraySumKadanes {
    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        sub(arr);
    }

    public static void sub(int arr[]) {
        // to check if all nos are negative or not
        int ctr = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ctr++;
                break;
            }
            if (arr[i] > largest) {
                largest = arr[i];// side by side largest negative no. bhi calculate krte raho
            }
        }

        if (ctr > 0) {
            // agar postive nos h toh kadanes algo lagao
            // KADANE'S
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                currsum += arr[i];
                if (currsum < 0) {
                    currsum = 0;
                }
                maxsum = Math.max(maxsum, currsum);
            }
            System.out.println("maxsum is- " + maxsum);
        } else {
            // sare negative h toh largest negative no. print krdo
            System.out.println("maxsum is- " + largest);
        }
    }
}