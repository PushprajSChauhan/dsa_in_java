import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(6);
        int max=Integer.MIN_VALUE;
        for(int i:list){
//            if(i>max){
//                max=i;
//            }
            max=Math.max(max,i);
        }
        System.out.println("Max element is "+max);
    }
}
