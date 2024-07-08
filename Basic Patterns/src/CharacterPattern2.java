import java.util.Scanner;

public class CharacterPattern2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char startChar=(char)('A'+i-1);
            while(j<=n){
                System.out.print(startChar);
                startChar++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
