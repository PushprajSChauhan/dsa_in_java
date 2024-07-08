import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
//        LOOP FOR FIRST HALF OF THE PATTERN
        for(int i=1;i<=n;i++){
//        FOR STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//        FOR SPACES
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
//        FOR STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        LOOP FOR THE SECOND HALF OF THE PATTERN
        for(int i=n;i>=1;i--){
//        FOR STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//        FOR SPACES
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
//        FOR STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
