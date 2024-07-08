import java.util.ArrayList;

public class MultidimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        list2.remove(3);
        list2.remove(2);
        mainList.add(list3);

        System.out.println(mainList);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j:currList){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
