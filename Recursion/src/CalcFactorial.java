public class CalcFactorial {
    public static int printFact(int n){
        if(n<0){
            return -1;
        }
//        BASE CASE
        if(n==0){
            return 1;
        }
//        FUNCTION KO YAHI SE CALL KRKE CHOTE WALE NUMBER KA FACTORIAL NIKAL KR USSE FACT MEI USE KRSKTE THE
//        KAAM JO ISS FUNCTION CALL KO KRNA HAI AND CALL TO NEXT FUNCTION
        int fact=n*printFact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printFact(n));
    }
}
