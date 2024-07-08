import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        for(int i=1;i<=n;i++){
//            FOR SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            FOR STARS AT BOUNDARY
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
