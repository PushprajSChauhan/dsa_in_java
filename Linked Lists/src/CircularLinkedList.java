public class CircularLinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            head.next=head;
            return;
        }
        newNode.next=head;
        head=newNode;
        tail.next=head;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            head.next=head;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }
    public void addMiddle(int index,int data){
        if(index==0){
//            NEW NODE IS TO BE ADDED AT FIRST POSITION
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void printLinkedList(){
        if (head == null) {
            System.out.println("Empty LinkedList");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Head)");
    }
    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();
        cll.addFirst(5);
        cll.addFirst(4);
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.addLast(8);
        cll.addLast(9);
        cll.addLast(10);
        cll.addMiddle(5,6);
        cll.addMiddle(6,7);
        cll.printLinkedList();
    }
}
