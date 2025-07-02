import java.util.ArrayList;
import java.util.Collections;

public class _8_lonely {

    public static ArrayList<Integer> isLonely(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();
        if (list.size() == 1){
            ans.add(list.get(0));
            return ans;
        }

        //first element
        if (list.get(0) != list.get(1) && list.get(0)+1 != list.get(1)){
            ans.add(list.get(0));
        }

        //middle elements
        for (int i = 1; i < list.size()-1; i++) {
            if ((list.get(i-1)!= list.get(i) && list.get(i+1) != list.get(i)) && (list.get(i-1)+1 != list.get(i) && list.get(i+1)-1 != list.get(i))){
                ans.add(list.get(i));
            }
        }

        //last element
        if (list.get(list.size()-1) != list.get(list.size()-2) && list.get(list.size()-1)-1 != list.get(list.size()-2)){
            ans.add(list.get(list.size()-1));
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println(isLonely(list));
    }
}
