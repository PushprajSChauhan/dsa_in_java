import java.util.Scanner;

public class DecimalToBinary {
    public static void decToBin(int n){
        int origNum=n;
        int bin=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println("Binary of "+origNum+"="+bin);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        decToBin(n);
    }
}
