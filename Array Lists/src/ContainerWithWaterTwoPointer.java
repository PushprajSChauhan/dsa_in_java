import java.util.ArrayList;

public class ContainerWithWaterTwoPointer {
    public static int maxWaterContainer(ArrayList<Integer> list){
        if (list.size() == 0) {
            return 0;
        }
//        2 POINTER APPROACH WITH O(n) TIME COMPLEXITY
        int maxWater = Integer.MIN_VALUE;
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int smallHeight = Math.min(list.get(left), list.get(right));
            int diff = right - left;
            int area = diff * smallHeight;
            maxWater = Math.max(maxWater, area);
            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxWaterContainer(list));
    }
}
