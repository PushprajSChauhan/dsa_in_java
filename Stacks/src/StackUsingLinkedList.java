import java.util.LinkedList;

public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
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
