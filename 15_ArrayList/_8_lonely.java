import java.util.ArrayList;
import java.util.Collections;

public class _8_lonely {

    public static ArrayList<Integer> isLonely(ArrayList<Integer> list){
        Collections.sort(list);
        int n = list.size();
        ArrayList<Integer> ans = new ArrayList<>();
        if (n == 1){ //edge case(single no. is also a lonely no.)
            ans.add(list.get(0));
            return ans;
        }

        //first element
        if (list.get(0) != list.get(1) && list.get(0)+1 != list.get(1)){
            ans.add(list.get(0));
        }

        //middle elements
        for (int i = 1; i < n-1; i++) {
            if ((list.get(i-1)!= list.get(i) && list.get(i+1) != list.get(i)) && (list.get(i-1)+1 != list.get(i) && list.get(i+1)-1 != list.get(i))){
                ans.add(list.get(i));
            }
        }

        //last element
        if (list.get(n-1) != list.get(n-2) && list.get(n-1)-1 != list.get(n-2)){
            ans.add(list.get(n-1));
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(6);
        // list.add(5);
        // list.add(8);
        list.add(0);

        System.out.println(isLonely(list));
    }
}
