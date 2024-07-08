import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        for(int i=1;i<=n;i++){
//            FOR SPACES
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
//            FOR NUMBERS
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
