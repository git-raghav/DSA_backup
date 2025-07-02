import java.util.ArrayList;

public class _3_2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> subList1 = new ArrayList<>();
        ArrayList<Integer> subList2 = new ArrayList<>();
        ArrayList<Integer> subList3 = new ArrayList<>();

        subList1.add(1);
        subList1.add(2);
        subList1.add(3);

        subList2.add(4);
        subList2.add(5);
        subList2.add(6);

        subList3.add(7);
        subList3.add(8);
        subList3.add(9);

        mainlist.add(subList1);
        mainlist.add(subList2);
        mainlist.add(subList3);

        System.out.println(mainlist);// one way to print

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currList = mainlist.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j));// another way to print
            }
            System.out.println();
        }

        tableList();
    }

    public static void tableList() {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> subList1 = new ArrayList<>();
        ArrayList<Integer> subList2 = new ArrayList<>();
        ArrayList<Integer> subList3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            subList1.add(i);
            subList2.add(i * 2);
            subList3.add(i * 3);
        }

        mainlist.add(subList1);
        mainlist.add(subList2);
        mainlist.add(subList3);

        System.out.println(mainlist);

    }
}
