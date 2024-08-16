package Set;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;

        HashMap<Integer,Integer> map=new HashMap<>();
//        Key=sum Value=count
        map.put(0,1);
        int sum=0,ans=0;

        for(int j=0;j<arr.length;j++){
            sum+=arr[j]; //sum(j)
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        System.out.println(ans);
    }
}
