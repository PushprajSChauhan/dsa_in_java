import java.util.Scanner;

public class Overloading1 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        int c=kb.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}
