import java.util.ArrayList;

public class _1_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add operation O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        list1.add(1,4); //O(n)
        System.out.println(list1);

        //get operation O(1)
        int element = list1.get(0);
        System.out.println(element);

        //delete operation O(n)
        list1.remove(1);
        System.out.println(list1);

        //set operation O(n)
        list1.set(0, 10);
        System.out.println(list1);

        //contains operation O(n)
        System.out.println(list1.contains(10));
        System.out.println(list1.contains(5));

        //size operation O(1)
        System.out.println(list1.size());
    }
}
