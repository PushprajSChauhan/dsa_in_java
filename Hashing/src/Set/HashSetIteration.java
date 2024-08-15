package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangalore");

        System.out.println("Traversal using iterator");
        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Traversal using enhanced for loop");
        for(String s:cities){
            System.out.println(s);
        }
    }
}
