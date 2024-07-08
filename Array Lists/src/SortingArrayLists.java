import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(78);
        list.add(88);
        list.add(34);
        list.add(13);
        list.add(46);
        System.out.println(list);
        Collections.sort(list); //FOR SORTING IN ASCENDING ORDER
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder()); //FOR SORTING IN DESCENDING ORDER
    }
}
