package Set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangalore");

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bangalore");

        System.out.println(cities);
        System.out.println(ts);
    }
}
