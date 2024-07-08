public class SearchInLinkedList {
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
    public int iterativeSearch(int key){
        Node temp=head;
        int index=0;
        while(temp.next!=null){
            if(temp.data==key){
                return index;
            }
            temp=temp.next;
            index++;
        }
//        KEY NOT FOUND
        return -1;
    }
    public int helper(Node head,int key){
//        BASE CASE
        if(head==null){
            return -1; //KEY NOT FOUND IN LINKEDLIST AFTER SEARCHING TILL THE LAST NODE
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI
        if(head.data==key){
            return 0;
        }
//        CALL TO INNER FUNCTION
        int index=helper(head.next,key);
        if(index==-1){
            return -1;
        }
        return index+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        SearchInLinkedList ll=new SearchInLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll.iterativeSearch(4));
        System.out.println(ll.iterativeSearch(10));
        System.out.println(ll.recursiveSearch(4));
        System.out.println(ll.recursiveSearch(10));
    }
}
