public class PowerOfX {
    public static int power(int x, int n){
//        BASE CASE
        if(n==0){
            return 1;
        }
//        KAAM JO ISS FUNCTION CALL SE KRVANA HAI AND CALL TO FUNCTION FOR SMALLER TASKS
//        int pow=x*power(x,n-1);
//        return pow;
        return x*power(x,n-1);
    }

//    THE BELOW GIVEN CODE GIVES A TIME COMPLEXITY OF O(logn)
    public static int optimizedPower(int x, int n){
//        BASE CASE
        if(n==0){
            return 1;
        }
//        CALL TO FUNCTION FOR SMALLER CALCULATIONS
        int halfPower=optimizedPower(x,n/2);
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI
        int squareOfHalfPower=(int)Math.pow(halfPower,2);
        if(n%2!=0){
            return squareOfHalfPower=x*squareOfHalfPower;
        }
        return squareOfHalfPower;
    }

    public static void main(String[] args) {
        System.out.println(power(2,6));
        System.out.println(optimizedPower(2,6));
    }
}
