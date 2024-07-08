import java.util.Scanner;

public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int origNum=binNum;
        int pow=0,decNum=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+origNum+"="+decNum);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        binToDec(n);
    }
}
