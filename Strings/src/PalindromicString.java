public class PalindromicString {
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
//                THIS IS NOT A PALINDROME
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isPalindrome(str));
    }
}
