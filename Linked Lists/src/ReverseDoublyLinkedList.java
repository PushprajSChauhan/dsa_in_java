public class ReverseDoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node previous;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.previous=newNode;
        head=newNode;
    }
    public void reverse(){
        Node previous=null;
        Node current=head;
        tail=head;
        Node next;
        while(current!=null){
//            STEP 1: INITIALIZE next VARIABLE
            next=current.next;
//            STEP 2: MAKE LINKS BACKWARDS
            current.next=previous;
//            STEP 3: MAKE previous POINT ON next NODE
            current.previous=next;
//            STEP 4: MAKE previous POINT ON current NODE
            previous=current;
//            STEP 5: MAKE current POINT ON next NODE
            current=next;
        }
//        HERE current POINTER HAS BECOME null SO THE LAST NODE WILL BE REFERRED BY previous POINTER WHICH SHOULD BECOME THE head OF REVERSED LINKEDLIST
        head=previous;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseDoublyLinkedList ll=new ReverseDoublyLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
