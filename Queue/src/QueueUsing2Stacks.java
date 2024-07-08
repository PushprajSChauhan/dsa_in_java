import java.util.Stack;

public class QueueUsing2Stacks {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
//        ADD FUNCTION IMPLEMENTATION
        public static void add(int data){
            while(s1.isEmpty()==false){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(s2.isEmpty()==false){
                s1.push(s2.pop());
            }
        }
//        REMOVE FUNCTION
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
//        PEEK FUNCTION
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
        return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
