public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty() {
            return head == null && tail == null;
        }
//      AS LINKED LISTS DO NOT HAVE A FIXED SIZE SO NO NEED TO CHECK FOR FULLY FILLED QUEUE
//      ADD FUNCTION
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
//      REMOVE FUNCTION
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
//          FOR SINGLE ELEMENT
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }
//      PEEK FUNCTION
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
}
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
