import java.util.HashMap;

public class HashMapInJava {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
//        Insert elements
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",60);
        System.out.println(hm);
//        HashMaps are unordered DS in Java i.e. their output is not in a fixed order and is a random fashion output

//        Retrieve elements
        int population=hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Australia"));

        System.out.println(hm.size());

//        Contains a key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Nagaland"));

//        Removal of a pair
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("UK"));
        System.out.println(hm);
        System.out.println(hm.size());

        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}