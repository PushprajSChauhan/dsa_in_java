import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack{
        Deque<Integer> deque=new LinkedList<>();
//        IMPLEMENT PUSH METHOD
        public void push(int data){
            deque.addLast(data);
        }
//        IMPLEMENT POP METHOD
        public int pop(){
            return deque.removeLast();
        }
//        IMPLEMENT PEEK METHOD
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
