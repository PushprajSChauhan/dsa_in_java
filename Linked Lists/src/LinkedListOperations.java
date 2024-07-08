public class LinkedListOperations {
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
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
//            FOR EMPTY LINKEDLIST
            head=tail=newNode;
            return;
        }
//        STEP 2 WILL BE TO LINK THE NEW NODE WITH THE EXISTING LAST NODE OBJECT OF LINKED LIST
        tail.next=newNode;
//        STEP 3 WILL BE TO MOVE TAIL ON NEW NODE
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
//        WHEN i BECOMES EQUAL TO index-1 THEN THE TEMP NODE POINTS AT THE PREVIOUS NODE OF REQUIRED INDEX
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("LinkedList is already empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
        int value= head.data;
        head=head.next;
        size--;
        return value;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("LinkedList is already empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
//        WE CAN TRAVERSE THE LINKEDLIST TO GET THE LAST SECOND ELEMENT WHOSE INDEX WILL BE size-2
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
//        HERE WE HAVE REACHED THE LAST SECOND ELEMENT AND NOW IT WILL POINT TOWARDS NULL AND SHLD BE THE TAIL OF LINKEDLIST
        int value=tail.data; //temp.next.data
        temp.next=null;
        tail=temp;
        size--;
        return value;
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
        LinkedListOperations ll=new LinkedListOperations();
        ll.printLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2,9);
//        SO THE LINKEDLIST WILL LOOK LIKE 1->2->3->4->null
        ll.printLinkedList();
        System.out.println(size);
        System.out.println(ll.removeFirst());
        System.out.println(size);
        ll.printLinkedList();
        System.out.println(ll.removeLast());
        System.out.println(size);
        ll.printLinkedList();
    }
}