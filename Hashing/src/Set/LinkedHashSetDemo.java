package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangalore");

        LinkedHashSet<String>  lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangalore");

        System.out.println(cities); //Insertion order not preserved
        System.out.println(lhs); //Insertion order preserved

        lhs.remove("Delhi");
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs);
    }
}
