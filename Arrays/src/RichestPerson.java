package ArrayQuesLeetCode;

public class RichestPerson {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        int wealth=maxWealth(accounts);
    }
    static int maxWealth(int [][] accounts){
//        person=row
//        amount=column
        int max=Integer.MIN_VALUE;
        for(int [] person:accounts){
//            refresh the sum of individual row to 0 and then compare it with max sum
            int rowsum=0;
            for(int amount:person){
                rowsum=rowsum+amount;
            }
//            now we have the sum of amounts of a person
//            compare the sum with max variable to check whether this person is richest or not
            if(rowsum>max){
                max=rowsum;
            }
        }
        return max;
    }
}
