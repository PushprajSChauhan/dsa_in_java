public class RemovingCycle {
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
    public static void removeCycle(){
//        DETECT CYCLE
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                //CYCLE EXISTS IN THE LINKEDLIST
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
//        FIND MEETING POINT OF 2 POINTERS
        else{
            slow=head;
            Node prev=null;
            while(slow!=fast){
                slow=slow.next;
                prev=fast;
                fast=fast.next;
            }
//        REMOVE CYCLE BY MAKING THE LAST NODE POINT TO NULL
            prev.next=null;
        }
    }
    public static boolean isCycle(){
//        FLOYD'S CYCLE FINDING ALGORITHM
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true; //CYCLE EXISTS IN THE LINKEDLIST
            }
        }
        return false;
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=temp;
//        1->2->3->4->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
