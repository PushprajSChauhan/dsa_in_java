import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
//        ANOTHER CHILD CLASS OF QUEUE IS ARRAYDEQUE
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
