public class CalcSum {
    public static int calcSum(int n){
//        BASE CASE
        if(n==1){
            return 1;
        }
//        KAAM JO ISS FUNCTION CALL PE KRNA HAI AND CALL TO FUNCTION FOR SMALLER VALUE
        int sum=n+calcSum(n-1);
        return sum;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(calcSum(n));
    }
}
