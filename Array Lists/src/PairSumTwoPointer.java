import java.util.ArrayList;

public class PairSumTwoPointer {

    public static boolean pairSum2(ArrayList<Integer> list,int target){
//        FIND PIVOT OR BREAKING POINT
        int pivot=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot=i;
                break;
            }
        }
        int left=pivot+1; //PLACE LEFT POINTER AT SMALLEST VALUE
        int right=pivot; //PLACE RIGHT POINTER AT LARGEST VALUE
        while(left!=right){
//            CASE 1
            if(list.get(left)+list.get(right)==target){
                return true;
            }
//            CASE 2
            else if(list.get(left)+list.get(right)>target){
                right=(list.size()+right-1)%list.size();
            }
//            CASE 3
            else{
                left=(left+1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list,target));
    }
}
