import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int reqdWeight=50;
//        EK 2D ARRAY BANAYENGE JISME INDEX OF ITEM AND UNKE VALUE TO WEIGHT RATIO KO DESCENDING ORDER MEI SORTED RKHENGE
        double ratios[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratios[i][0]=i;
            ratios[i][1]=val[i]/(double)weight[i];
        }
//        WE WILL SORT THE RATIOS ARRAY ON THE BASIS OF FIRST COLUMN HAVING RATIO OF VALUE:WEIGHT OF ITEMS
        Arrays.sort(ratios, Comparator.comparingDouble(o->o[1]));
//        AB DESCENDING ORDER MEI TRAVERSE KRENGE ARRAY KO AND USS ITEM KO KNAPSACK MEI DALTE JAYENGE AUR KNAPSACK KE CAPACITY KO UPDATE KRTE JAYENGE
        int capacity=reqdWeight;
        int finalValue=0;
        for(int i= ratios.length-1;i>=0;i--){
//            USS INDEX KE ITEM KO PHLE DALENGE JISKA RATIO SBSE JYADA HOGA
            int index= (int) ratios[i][0];
            if(capacity>=weight[index]){
//                TAKE THE ITEM IN COMPLETE QUANTITY
                finalValue+=val[index];
                capacity=capacity-weight[index];
            }
            else{
//                TAKE THE ITEM IN FRACTIONS
                finalValue+=(ratios[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Max profit "+finalValue);
    }
}
