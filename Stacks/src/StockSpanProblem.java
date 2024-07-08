import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currPrice=stocks[i];
//            REMOVE ALL INDEXES WHOSE VALUE OF SHARE PRICE ARE SMALLER THAN THE CURRENT PRICE
            while(s.isEmpty()==false && currPrice>stocks[s.peek()]){
                s.pop();
            }
//            NOW ONLY THAT INDEX IS LEFT AT WHICH THE SHARE PRICE IS MORE THAN CURRENT PRICE
            if(s.isEmpty()){
//                AS ALL SHARE PRICES WERE SMALLER THAN CURRENT DAY'S SHARE PRICE WE WILL PUT INDEX+1 IN STACK FOR INCLUDING THE CURRENT DAY AS A SPAN
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];

        stockSpan(stocks,span);
        for(int i:span){
            System.out.print(i+" ");
        }
    }
}
