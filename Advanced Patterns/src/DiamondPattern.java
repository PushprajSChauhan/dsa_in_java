import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
//        FOR FIRST HALF
        for(int i=1;i<=n;i++){
//            FOR SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            FOR STARS
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        FOR SECOND HALF
        for(int i=n;i>=1;i--){
//            FOR SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            FOR STARS
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
