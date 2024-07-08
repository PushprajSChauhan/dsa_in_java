import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
//        PUSH METHOD
        public static void push(int data){
            list.add(data);
//            YAHA PR DATA LIST KE END MEI ADD HOGA JISKE KARAN AUTOMATICALLY HAMARA DATA STACK KE TOP PE PRESENT HOGA
        }
//        POP METHOD
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.remove(list.size()-1);
            return top;
        }
//        PEEK METHOD
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(s.isEmpty()==false){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.isEmpty());
    }
}