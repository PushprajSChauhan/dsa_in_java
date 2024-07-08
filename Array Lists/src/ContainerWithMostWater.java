import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
//        BRUTE FORCE APPROACH WITH O(n^2) TIME COMPLEXITY
        for(int i=0;i<height.size();i++){
            for(int j=1;j<height.size();j++){
                int smallHeight=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWater=smallHeight*width;
                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storeWater(list));
    }
}
