import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character>s=new Stack<>();
        int index=0;
        while(index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder res=new StringBuilder("");
        while(s.isEmpty()==false){
            char currentChar=s.pop();
            res.append(currentChar);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("abc"));
    }
}
