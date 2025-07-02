import java.util.ArrayList;
import java.util.Collections;

public class _2_BasicProblem {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(9);
        list1.add(3);
        list1.add(4);

        // reverse
        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.print(list1.get(i));
        }
        System.out.println();

        // find max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            max = Math.max(max, list1.get(i));
        }
        System.out.println(max);

        // swap
        System.out.println(list1);
        swap(list1, 0, 3);
        System.out.println(list1);

        // sort ascending
        Collections.sort(list1);// use collections not collection
        System.out.println(list1);

        // sort descending
        Collections.sort(list1, Collections.reverseOrder());// use comparator
        System.out.println(list1);
    }

    public static void swap(ArrayList<Integer> list1, int i, int j) {
        int temp = list1.get(i);
        list1.set(i, list1.get(j));
        list1.set(j, temp);
    }
}
