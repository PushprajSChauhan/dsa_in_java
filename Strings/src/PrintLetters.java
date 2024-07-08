public class PrintLetters {
    public static void printLetters(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String fullname="Tony Stark";
        printLetters(fullname);
    }
}
