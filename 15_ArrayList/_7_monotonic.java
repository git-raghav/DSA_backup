import java.util.ArrayList;
public class _7_monotonic {

    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)) {
                inc = false;
            }
            if (list.get(i) < list.get(i+1)) {
                dec = false;
            }
            if(inc == false && dec == false) return false; // if both becomes false directly return no need to check further
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(1);

        System.out.println(isMonotonic(list));
    }
}
