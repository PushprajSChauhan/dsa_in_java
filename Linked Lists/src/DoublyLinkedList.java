public class DoublyLinkedList {
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
    public static int size;
//    ADDING NEW NODES TO DOUBLY LINKED LIST
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.previous=newNode;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.previous=tail;
        tail=newNode;
    }
//    REMOVING NODES FROM DOUBLY LINKED LIST
    public int removeFirst(){
        if(head==null){
            System.out.println("Doubly Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.previous=null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("Doubly Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.previous;
        tail.next=null;
        size--;
        return val;
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
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println(dll.size);
        System.out.println(dll.removeFirst());
        System.out.println(dll.removeLast());
        dll.print();
        System.out.println(dll.size);
    }
}
