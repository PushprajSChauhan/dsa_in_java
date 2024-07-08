public class PrintInDecreasingOrder {
    public static void printDecreasing(int n){
//        BASE CASE
        if(n==1){
            System.out.println(n);
            return;
//            RETURN KRNE SE PICHLE WALE FUNCTION CALL KE PAAS CHALA JAYEGA CONTROL
        }
//        KAAM JO ISS FUNCTION CALL KO KRNA HAI
        System.out.print(n+" ");
//        CALL MADE TO INNER FUNCTION
        printDecreasing(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        printDecreasing(n);
    }
}