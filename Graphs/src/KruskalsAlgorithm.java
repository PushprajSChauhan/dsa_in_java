import java.util.*;
public class KruskalsAlgorithm {
    static class Edge implements Comparable<Edge>{
        int src,dest,wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

        @Override
        public int compareTo(Edge e){
            return this.wt-e.wt;
        }
    }

    static void creteGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));
    }

    static int n=4; //number of vertices
    static int[] par=new int[n];
    static int[] rank=new int[n];

    public static void init(){
        for (int i = 0; i < n; i++) {
            par[i]=i;
        }
    }

    public static int findLeader(int x){
        if(x==par[x]){
            return x;
        }

        return par[x]=findLeader(par[x]);
    }

    public static void union(int a, int b) {
        int parA = findLeader(a);
        int parB = findLeader(b);

        if (rank[parA] == rank[parB]) {
//            kisiko bhi doosre ka parent bana do
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void kruskalsMST(ArrayList<Edge> edges, int V){
        Collections.sort(edges);
        int mstCost=0,count=0;

        for (int i = 0; count < V-1; i++) {
//            i is used to traverse edges and the traversal will stop when all edges (V-1) will be covered
            Edge e=edges.get(i);
//            now include the edge after checking whether it creates a cycle or not
            int parA=findLeader(e.src);
            int parB=findLeader(e.dest);

            if(parA!=parB){
                union(e.src,e.dest);
                mstCost+=e.wt;
                count++;
            }
        }

        System.out.println(mstCost);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> edges=new ArrayList<>();
        creteGraph(edges);
        init();
        kruskalsMST(edges,V);
    }
}
