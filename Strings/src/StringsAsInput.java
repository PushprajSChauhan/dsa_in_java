import java.util.Scanner;

public class StringsAsInput {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String name=kb.next();
        System.out.println(name);
        kb.nextLine();
        String fullName=kb.nextLine();
        System.out.println(fullName);
    }
}
