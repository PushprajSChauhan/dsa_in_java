public class MergeSortLinkedList {
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

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node leftHead,Node rightHead){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(leftHead!=null && rightHead!=null){
            if(leftHead.data<=rightHead.data){
                temp.next=leftHead;
                leftHead=leftHead.next;
                temp=temp.next;
            }
            else{
                temp.next=rightHead;
                rightHead=rightHead.next;
                temp=temp.next;
            }
        }
        while(leftHead!=null){
            temp.next=leftHead;
            leftHead=leftHead.next;
            temp=temp.next;
        }
        while(rightHead!=null){
            temp.next=rightHead;
            rightHead=rightHead.next;
            temp=temp.next;
        }
        return mergedLL.next; //BECAUSE PHLE NODE PE -1 RAKHA THA AS A DUMMY NODE JISSE MAIN LINKEDLIST MEI NAHI HONA CHIYE
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
//        FIND THE MID NODE OF THE ORIGINAL LINKEDLIST
        Node mid=getMid(head);
//        MERGE SORT THE LEFT AND RIGHT HALVES
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
//        MERGE BOTH PARTS
        return merge(newLeft,newRight);
    }
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
    public void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null"); //THIS WILL ALSO HANDLE THE CASE FOR EMPTY LINKEDLIST
    }
    public static void main(String[] args) {
        MergeSortLinkedList ll=new MergeSortLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLinkedList();
        ll.head=ll.mergeSort(ll.head);
        ll.printLinkedList();
    }
}
