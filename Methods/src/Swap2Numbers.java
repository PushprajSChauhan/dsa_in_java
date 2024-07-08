import java.util.Scanner;

public class Swap2Numbers {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+","+b);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        swap(a,b);
        System.out.println(a+","+b);
    }
}
