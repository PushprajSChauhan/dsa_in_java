package Set;

import java.util.HashSet;

public class HashSetInJava {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(2);

        System.out.println(set);
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        if(set.contains(3)){
            System.out.println("set contains 3");
        }
        set.remove(3);
        if(set.contains(3)){
            System.out.println("set contains 3");
        }
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
