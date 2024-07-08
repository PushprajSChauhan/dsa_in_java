public class PrintInIncreasingOrder {
    public static void printIncreasing(int n){
//        BASE CASE
        if(n==1){
            System.out.print(n+" ");
            return;
        }
//        YAHA PE PHLE HAME N-1 WALE NUMBER KO PRINT KRVANA H FOR EVERY N AND THEN KHUD KO PRINT KRVAYENGE
//        CALL TO INNER FUNCTION FOR PRINTING THE SMALLER NUMBERS FIRST TO GET OUTPUT IN ASCENDING ORDER
        printIncreasing(n-1);
//        KAAM JO ISS FUNCTION CALL PE KRNA H
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=10;
        printIncreasing(n);
    }
}
