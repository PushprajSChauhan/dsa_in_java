import java.util.Scanner;

public class Multiply2Numbers {
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        int result=multiply(a,b);
        System.out.println(result);
    }
}
