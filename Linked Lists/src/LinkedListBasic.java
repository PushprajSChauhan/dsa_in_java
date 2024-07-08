import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
//        CREATING A LINKEDLIST
        LinkedList <Integer> ll=new LinkedList<>();
//        ADDING ELEMENTS IN LINKEDLIST
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
//        REMOVING ELEMENTS FROM A LINKEDLIST
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
