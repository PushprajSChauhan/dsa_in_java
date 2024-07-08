public class RemoveNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        public Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static Node head; //REFERENCE FOR POINTING TOWARD THE HEAD NODE
    public static Node tail; //REFERENCE FOR POINTING TOWARD THE TAIL NODE
    public static int size;
    public void addFirst(int data){
//        STEP 1 WILL BE TO CREATE THE NEW NODE OBJECT THAT NEEDS TO BE ADDED
        Node newNode=new Node(data);
        size++;
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
    public void deleteNthFromEnd(int n){
//        CALCULATE THE SIZE OF LINKEDLIST TO ACCESS THE SAME NODE FROM START
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
//        CHECK IF WE NEED TO REMOVE HEAD
        if(n==size){
            head=head.next; //REMOVE FIRST NODE
            return;
        }
        int index=1;
        int indexToFind=size-n;
        Node temp1=head;
        while(index<indexToFind){
//            REACH THE (size-n)th INDEX
            temp1=temp1.next;
            index++;
        }
        temp1.next=temp1.next.next;
        return;
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
        RemoveNthNodeFromEnd ll=new RemoveNthNodeFromEnd();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLinkedList();
        ll.deleteNthFromEnd(3);
        ll.printLinkedList();
    }
}
