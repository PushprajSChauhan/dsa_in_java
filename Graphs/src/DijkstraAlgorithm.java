import java.util.*;
public class DijkstraAlgorithm {
    static class Edge{
        int src,dest,wt;
        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }

    static class Pair implements Comparable<Pair>{
        int n,path;

        public Pair(int n,int path){
            this.n=n;
            this.path=path;
        }

        @Override
        public int compareTo(Pair p){
            return this.path-p.path; //path based sorting
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        int dist[]=new int[graph.length]; //distances of all nodes from src to that node
//        initializing distances for all nodes
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(src,0));

//        loop for bfs
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;
//                update the distances of neighbors to shortest distance
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    if(dist[u]+wt < dist[v]){
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }

        for(int i:dist){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int vertices=6;
        ArrayList<Edge> [] graph=new ArrayList[vertices];
        createGraph(graph);

        int src=0;
        dijkstra(graph,src);
    }
}
