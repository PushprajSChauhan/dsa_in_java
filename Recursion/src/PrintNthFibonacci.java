public class PrintNthFibonacci {
    public static int fibonacci(int n){
//        BASE CASES
        if(n==0 || n==1){
            return n;
        }
//        CALL TO FUNCTION FOR CALCULATING SMALLER VALUES
        int fibNminus1=fibonacci(n-1);
        int fibNminus2=fibonacci(n-2);
//        KAAM JO ISS FUNCTION CALL PAR KRNA HAI
        int fib=fibNminus1+fibNminus2;
        return fib;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacci(n));
    }
}
