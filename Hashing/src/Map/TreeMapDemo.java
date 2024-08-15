package Map;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("USA",50);
        tm.put("Nepal",10);

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("USA",50);
        hm.put("Nepal",10);

        System.out.println(hm);
        System.out.println(tm);
    }
}
