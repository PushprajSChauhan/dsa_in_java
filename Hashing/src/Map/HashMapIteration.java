package Map;

import java.util.HashMap;
import java.util.Set;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        hm.put("Nepal",10);
        hm.put("UK",20);

        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String s:keys){
            System.out.println("key= "+s+", value= "+hm.get(s));
        }
    }
}
