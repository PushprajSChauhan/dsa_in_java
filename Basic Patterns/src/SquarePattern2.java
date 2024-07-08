import java.util.Scanner;

public class SquarePattern2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
