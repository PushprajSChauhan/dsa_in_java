import java.util.Scanner;

public class PalindromicNumbers {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        for(int i=1;i<=n;i++){
//            FOR SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            FOR DECREASING NUMBERS
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
//            FOR INCREASING NUMBERS
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
