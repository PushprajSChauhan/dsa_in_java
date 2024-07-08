import java.util.Scanner;

public class PrimeInRange {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n){
        for(int j=2;j<=n;j++){
            if(isPrime(j)) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        primesInRange(n);
    }
}
