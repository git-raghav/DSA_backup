import java.util.*;

public class _1_linearSearch {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 12;
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("key not present");
        } else {
            System.out.println("key present at index - " + index);
        }
    }

    public static int search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}