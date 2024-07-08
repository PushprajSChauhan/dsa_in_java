import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue{
        Deque<Integer> deque=new LinkedList<>();
//        IMPLEMENT ENQUEUE METHOD
        public void enqueue(int data){
            deque.addLast(data);
        }
//        IMPLEMENT DEQUEUE METHOD
        public int dequeue(){
            return deque.removeFirst();
        }
//        IMPLEMENT PEEK METHOD
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.peek());
        System.out.println("Removed "+q.dequeue());
        System.out.println("Removed "+q.dequeue());
        System.out.println("Removed "+q.dequeue());
    }
}
