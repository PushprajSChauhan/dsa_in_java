import java.util.Scanner;

public class TrianglePattern5 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
