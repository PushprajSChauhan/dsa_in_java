import java.util.Scanner;

public class CharacterPattern3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int i=1;
        char ch='A';
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(ch);
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
