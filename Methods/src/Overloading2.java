import java.util.Scanner;

public class Overloading2 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float x, float y){
        return x+y;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        float x=kb.nextFloat();
        float y=kb.nextFloat();
        System.out.println(sum(a,b));
        System.out.println(sum(x,y));
    }
}
