import java.util.Scanner;

public class PrimeNumber1 {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(isPrime(n));
    }
}
