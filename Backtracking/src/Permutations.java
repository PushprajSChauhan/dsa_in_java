public class Permutations {
    public static void printPermutations(String str,String ans){
//        BASE CASE
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
//        KAAM JO ISS FUNCTION CALL PR KRWANA HAI
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i); //VOH CHARACTER PICK KRNA JISSE ANS STRING MEI ADD KRNA HAI
            String newStr=str.substring(0,i)+str.substring(i+1); //ORIGINAL STRING MEI SE USS CHACTER KO HATANA JISSE ALREADY ANS STRING MEI ADD KRDIYA HAI
//            CALL TO INNER FUNCTION
            printPermutations(newStr,ans+currChar);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        printPermutations(s,"");
    }
}
