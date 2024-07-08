public class Subsets {
    public static void printSubsets(String str, String ans, int i){
//        BASE CASE
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
//        KAAM JO ISS FUNCTION MEI KRWANA HAI
//        IF CHARACTER DECIDES TO BE A PART OF SUBSET
        printSubsets(str,ans+str.charAt(i),i+1);
//        IF CHARACTER DECIDES NOT TO BE A PART OF SUBSET
        printSubsets(str,ans,i+1);
    }
    public static void main(String[] args) {
        String s="abc";
        printSubsets(s,"",0);
    }
}
