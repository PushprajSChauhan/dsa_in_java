public class BinaryStrings {
    public static void printBinary(int n, int lastPlace, String str){
//        BASE CASE
        if(n==0){
            System.out.println(str);
            return;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI AND CALL TO INNER FUNCTIONS
        if(lastPlace==0){
//            PLACE 0 ON nTH PLACE, SO NOW WE HAVE TO PLACE ON n-1 INDEXES AND APPEND 0 IN BINARY STRING
            printBinary(n-1,0,str+"0");
//            PLACE 1 ON nTH PLACE, SO NOW WE HAVE TO PLACE ON n-1 INDEXES AND APPEND 0 IN BINARY STRING
            printBinary(n-1,1,str+"1");
        }
        else{
            printBinary(n-1,0,str+"0");
        }
//        OR WE CAN ALWAYS CALL FOR PLACING 0 ON nTH PLACE AND PLACE 1 ONLY IF LAST PLACE WAS 0
//        printBinary(n-1,0,str+"0");
//        if(lastPlace==0){
//            printBinary(n-1,1,str+"1");
//        }
    }

    public static void main(String[] args) {
        printBinary(4,0,"");
    }
}
