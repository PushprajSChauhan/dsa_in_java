package Set;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map=new HashMap<>();
//        Key=sum Value=index

        int sum=0,length=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)) {
                length = Math.max(length, j - map.get(sum));
            }
            map.put(sum,j);
        }

        System.out.println("Largest subarray with 0 sum "+length);
    }
}
