import java.util.Scanner;

public class BinomialCoefficient {
    public static int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialCoefficient(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int result=n_fact/(r_fact*nmr_fact);
        return result;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int r=kb.nextInt();
        int ans=binomialCoefficient(n,r);
        System.out.println(ans);
    }
}
