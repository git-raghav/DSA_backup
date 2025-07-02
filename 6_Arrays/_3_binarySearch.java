import java.util.*;

public class _3_binarySearch {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("key not present");
        } else {
            System.out.println("key present at index- " + index);
        }
    }

    public static int search(int numbers[], int key) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (key < numbers[mid]) {
                high = mid - 1;
            } else if (key > numbers[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}