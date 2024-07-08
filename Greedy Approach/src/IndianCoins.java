import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int currencyCount=0;
        int amount=591;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
//            if(amount>=coins[i]){
                while(amount>=coins[i]){
                    currencyCount++;
                    list.add(coins[i]);
                    amount=amount-coins[i];
                }
//            }
        }
        System.out.println("Total coins used "+currencyCount);
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
