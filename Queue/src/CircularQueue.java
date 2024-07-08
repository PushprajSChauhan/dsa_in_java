public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        public Queue(int n){
            arr=new int[n];
            size=n;
            rear=front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
//        ADDING ELEMENT IN CIRCULAR QUEUE
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
//            FOR ADDING FIRST ELEMENT
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
//        REMOVING ELEMENT
        public static int remove(){
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
//            FOR REMOVING LAST ELEMENT
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
//        PEEK FUNCTION ELEMENT
        public static int peek(){
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}