import java.util.Scanner;

public class ParameterisedMethods {
    public static void calculateSum(int n1,int n2){
        int sum=n1+n2;
        System.out.println("sum is "+sum);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        calculateSum(a,b);
    }
}
