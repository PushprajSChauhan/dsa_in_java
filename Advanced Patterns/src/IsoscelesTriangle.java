import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        for(int i=1;i<=n;i++){
//            LOOP FOR PRINTING SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            LOOP FOR PRINTING INCREASING NUMBERS
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
//            LOOP FOR PRINTING DECREASING NUMBERS
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
