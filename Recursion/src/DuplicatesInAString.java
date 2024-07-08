public class DuplicatesInAString {
    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]){
//        BASE CASE
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI AND CALL TO FUNCTION FOR FURTHER SMALLER CALCULATIONS
        char currChar=str.charAt(index);
        if(map[currChar-'a']==true){
//            CHARACTER ALREADY EXISTS SO NO NEED TO ADD IT AND CHECK FOR NEXT CHARACTER
            removeDuplicates(str,index+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str,index+1,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args) {
        String str="mississippi";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
