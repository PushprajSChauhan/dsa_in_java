import java.util.PriorityQueue;

public class ConnectingCities {
    static class Edge implements Comparable<Edge>{
//        yaha source variable nahi rkh rhe hain bcos jis vertex pe rhenge vhi source hogi toh isliye alg se nahi use krenge variable
        int dest,cost;
        public Edge(int d,int c){
            this.dest=d;
            this.cost=c;
        }

        @Override
        public int compareTo(Edge e){
            return this.cost-e.cost;
        }
    }
    public static int connectCities(int cities[][]){
        PriorityQueue<Edge> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[cities.length];

        pq.add(new Edge(0,0)); // adding 0 as source in the PQ
        int finalCost=0;

        while (!pq.isEmpty()){
            Edge curr=pq.remove();
            if(vis[curr.dest]==false){
                vis[curr.dest]=true;
                finalCost+=curr.cost;

                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if(cities[curr.dest][i]!=0){
//                        non-zero cost wale neighboring edges ko hi consider krenge MST banake cost niklane mei
                        pq.add(new Edge(i,cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        int cities[][]={{0,1,2,3,4},{1,0,5,0,7},{2,5,0,6,0},{3,0,6,0,0},{4,7,0,0,0}};
        System.out.println(connectCities(cities));
    }
}
