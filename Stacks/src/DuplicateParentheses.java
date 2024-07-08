import java.util.Stack;

public class DuplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
//        CLOSING CASE
            if(ch==')'){
                int count=0;
//                KYOKI EXPRESSION MEI VALID PARENTHESES HAIN ISLIYE STACK KABHI EMPTY NAHI HOGA AND HAR CLOSING KA PHLE SE HI EK OPENING RHEGA
                while(s.peek()!='('){
                    count++;
                    s.pop();
                }
                if (count < 1) {
                    return true;
                }
                s.pop(); //IF NON-DUPLICATE PARENTHESES PAIR IS FOUND THEN REMOVE THE ELEMENTS BETWEEN THEM AND THE OPENING PAIR
            }
//            OPENING CASE
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="((a+b))";
        String str2="(a-b)";
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
