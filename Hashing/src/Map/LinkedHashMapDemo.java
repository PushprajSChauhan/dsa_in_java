package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("USA",50);
        lhm.put("Nepal",10);

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        hm.put("Nepal",10);

        System.out.println(lhm); //insertion order preserved
        System.out.println(hm); //insertion order not preserved
    }
}
