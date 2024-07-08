public class PairingFriends {
    public static int pairsCount(int n){
//        BASE CASE
        if(n==1 || n==2){
            return n;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI AND CALL TO INNER FUNCTION
//        FOR FRIENDS WHO WANT TO BE SINGLE
        int fnm1=pairsCount(n-1);
//        FOR FRIENDS WHO WANT TO PAIR UP WITH OTHERS
        int fnm2=pairsCount(n-2);
        int pairWays=(n-1)*fnm2; //PAIRING KE KITNE WAYS HAIN x EK KE SAATH PAIR BANA LIYA TOH FIR KITNE WAYS HAIN
//        TOTAL WAYS
        int totalWays=fnm1+pairWays;
        return totalWays;

//        OR SIMPLY WE CAN WRITE
//        return pairsCount(n-1)+(n-1)*pairsCount(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pairsCount(3));
    }
}
