import java.util.PriorityQueue;

public class PriorityQueueForObjects {
    static class Student implements Comparable<Student>{
        private String name;
        private int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s){
            return this.rank-s.rank;
//            PRIORITY WILL BE DECIDED ON THE BASIS OF RANK
//            FOR -VE VALUE this.Object IS SMALLER TOH USSE HI PRIORITY MILEGI
//            FOR +VE VALUE this.Object IS GREATER TOH PARAMETER WALE OBJECT KO PRIORITY MILEGI
//            FOR EQUAL VALUE DIFFERENCE WILL BE ZERO TOH KISI BHI OBJECT KO PRIORITY DESKTE HAIN
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+", "+pq.peek().rank);
            pq.remove();
        }
    }
}
