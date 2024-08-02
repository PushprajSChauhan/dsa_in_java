import java.util.Arrays;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int number,index;
        public Pair(int number, int index){
            this.number=number;
            this.index=index;
        }

        @Override
        public int compareTo(Pair p){
//            For sorting in ascending order
//            return this.number-p.number;
//            For sorting in descending order as we want to implement maxheap
            return p.number-this.number;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int [arr.length-k+1];

        PriorityQueue<Pair> pq=new PriorityQueue<>();
//        Store the elements in the first window
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }

        res[0]=pq.peek().number;

//        Store the next elements one by one in the PQ
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().index<=i-k){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1]=pq.peek().number;
        }
        System.out.println(Arrays.toString(res));
    }
}
