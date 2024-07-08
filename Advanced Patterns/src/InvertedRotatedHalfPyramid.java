import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        for(int i=1;i<=n;i++){
//            FOR PRINTING SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            FOR PRINTING STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}