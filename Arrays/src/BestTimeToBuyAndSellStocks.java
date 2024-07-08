public class BestTimeToBuyAndSellStocks {
    public static int buyAndSellStocks(int nums[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<nums.length;i++){
            if(buyPrice<nums[i]){
                int profit=nums[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buyPrice=nums[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Max profit is "+buyAndSellStocks(prices));
    }
}
