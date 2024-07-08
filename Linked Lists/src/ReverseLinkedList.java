public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static Node head; //REFERENCE FOR POINTING TOWARD THE HEAD NODE
    public static Node tail;
    public void addFirst(int data){
//        STEP 1 WILL BE TO CREATE THE NEW NODE OBJECT THAT NEEDS TO BE ADDED
        Node newNode=new Node(data);
        if(head==null){
//            FOR EMPTY LINKEDLIST
            head=tail=newNode;
            return;
        }
//        STEP 2 WILL BE TO LINK THE NEW NODE WITH THE EXISTING FIRST NODE OBJECT OF LINKED LIST
        newNode.next=head; //AB BHALE HI HEAD VARIABLE KAHI AUR POINT KRNE LGJAYE BUT HAMARA NAYA NODE USSI NODE OBJECT KO POINT KRTA RHEGA JAHA PE USKO INITIALIZE KIYA THA USING HEAD VARIABLE
//        STEP 3 WILL BE TO MOVE HEAD ON NEW NODE
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
//            STEP 3: MAKE previous POINT ON current NODE
            previous=current;
//            STEP 4: MAKE current POINT ON next NODE
            current=next;
        }
//        HERE current POINTER HAS BECOME null SO THE LAST NODE WILL BE REFERRED BY previous POINTER WHICH SHOULD BECOME THE head OF REVERSED LINKEDLIST
        head=previous;
    }
    public void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null"); //THIS WILL ALSO HANDLE THE CASE FOR EMPTY LINKEDLIST
    }
    public static void main(String[] args) {
        ReverseLinkedList ll=new ReverseLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLinkedList();
        ll.reverse();
        ll.printLinkedList();
    }
}
