import java.util.Scanner;

public class TrianglePattern4 {
    public static void main(String[] args) {
//        THIS PATTERN IS ALSO CALLED FLOYD'S TRIANGLE
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int startNum=1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(startNum+" ");
                startNum++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
