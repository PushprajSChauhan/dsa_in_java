package Map;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map=new HashMap<>();
//        populate the hashmap
        for(int i=0;i<arr.length;i++){

//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }
//            else{
//                map.put(arr[i],1);
//            }

//            The shorthand for the above if-else statements is given below
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
//            This getOrDefault() method checks for the existence of a key in map and returns its value, if the key is not present in map it returns a default value
        }
//        traverse the hashmap to get the element with frequency>(n/3)
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}
