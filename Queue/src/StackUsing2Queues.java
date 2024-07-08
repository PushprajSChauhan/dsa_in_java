import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
//        PUSH FUNCTION
        public static void push(int data){
            if(q1.isEmpty()==false){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
//        POP FUNCTION
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=-1;
//            CASE 1 WHEN Q1 IS HAVING ALL ELEMENTS
            if(q1.isEmpty()==false){
                while(q1.isEmpty()==false){
                    top=q1.remove();
                    if(q1.isEmpty()){
//                        AGAR YAHA AYE HAIN MATLB QUEUE AB KHALI HOGYI HAI AND TOP VARIABLE MEI QUEUE KA LAST ELEMENT HAI JISSE AB RETURN KRDENGE
                        break;
                    }
                    q2.add(top);
                }
            }
//            CASE 2 WHEN Q2 IS HAVING ALL ELEMENTS
            else{
                while(q2.isEmpty()==false){
                    top=q2.remove();
                    if(q2.isEmpty()){
//                        AGAR YAHA AYE HAIN MATLB QUEUE AB KHALI HOGYI HAI AND TOP VARIABLE MEI QUEUE KA LAST ELEMENT HAI JISSE AB RETURN KRDENGE
                        break;
                    }
                    q1.add(top);
                }
            }
//            JISS BHI QUEUE MEI ELEMENTS PRESENT HONGE USKA LAST ELEMENT TOP VARIABLE MEI AAJAYEGA JISSE HAM RETURN KRDENGE
            return top;
        }
//        PEEK FUNCTION
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=-1;
//            CASE 1 WHEN Q1 IS HAVING ALL ELEMENTS
            if(q1.isEmpty()==false){
                while(q1.isEmpty()==false){
                    top=q1.remove();
                    q2.add(top);
                }
            }
//            CASE 2 WHEN Q2 IS HAVING ALL ELEMENTS
            else{
                while(q2.isEmpty()==false){
                    top=q2.remove();
                    q1.add(top);
                }
            }
//            JISS BHI QUEUE MEI ELEMENTS PRESENT HONGE USKA LAST ELEMENT TOP VARIABLE MEI AAJAYEGA JISSE HAM RETURN KRDENGE
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
