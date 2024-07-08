import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(s.isEmpty()==false){
            System.out.println(s.pop());
        }
    }
    public static void pushAtBottom(Stack<Integer> s,int data){
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
}
