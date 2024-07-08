public class PalindromeLinkedList {
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
    public Node findMiddle(Node head){
//        THIS WILL ACT AS A HELPER FUNCTION FOR THE PALINDROME METHOD
//        SLOW-FAST OR TORTOISE-HARE APPROACH
        Node slow=head;
        Node fast=head;
//        FOR EVEN NUMBER OF NODES THE fast POINTER WILL REACH THE null
//        FOR ODD NUMBER OF NODES THE fast POINTER WILL REACH THE NODE PREVIOUS TO null
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
//        HERE THE SLOW POINTER WILL BE AT THE MIDDLE NODE
        return slow;
    }
    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
//        STEP 1: FIND THE MIDDLE NODE
        Node mid=findMiddle(head);
//        STEP 2: REVERSE SECOND HALF
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
//        STEP 3: COMPARE BOTH HALVES
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
        PalindromeLinkedList ll=new PalindromeLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLinkedList();
        System.out.println(ll.isPalindrome());
    }
}
