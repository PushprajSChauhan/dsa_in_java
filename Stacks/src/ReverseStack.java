import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data){
//        BASE CASE
        if(s.isEmpty()){
            s.push(data);
            return;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI
//        IMPLICIT STACK MEI UPAR JAATE HUE ELEMENTS KO REMOVE KRNA HAI HAMARE STACK SE
        int top=s.pop();
//        CALL TO INNER FUNCTION
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
//        BASE CASE
        if(s.isEmpty()){
//            EMPTY STACK IS ALREADY REVERSED
            return;
        }
//        KAAM JO ISS FUNCTION PR KRNA HAI AND CALL TO INNER FUNCTION
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
