import java.util.Deque;
import java.util.LinkedList;

public class DequeBasic {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        System.out.println("Removed last element "+deque.removeLast());
        System.out.println("First element is "+deque.getFirst()+" and last element is "+deque.getLast());
    }
}
