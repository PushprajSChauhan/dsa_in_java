import java.util.Scanner;

public class FactorialOfANumber {
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int result=fact(a);
        System.out.println(result);
    }
}
