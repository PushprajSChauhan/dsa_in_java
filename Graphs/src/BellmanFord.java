import java.util.ArrayList;

public class BellmanFord {
    static class Edge{
        int src,dest,wt;
        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }

    static void createGraph2(ArrayList<Edge> graph){
//        yaha hame vertices se koi kaam nahi hai isliye sirf edges ke basis pe graph bana rahe hain
        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0,2,4));

        graph.add(new Edge(1,2,-4));

        graph.add(new Edge(2,3,2));

        graph.add(new Edge(3,4,4));

        graph.add(new Edge(4,1,-1));
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src){
        int dist[]=new int[graph.length];

        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        int V=graph.length;
        for(int i=0;i<V-1;i++){
//            reach all vertices
            for(int j=0;j<graph.length;j++){
//                reach all edges for that vertex
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

//                    relaxation step
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }

        for(int i:dist){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void bellmanFord2(ArrayList<Edge> graph, int src, int vertices){
        int dist[]=new int[vertices];

        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        for(int i=0;i<vertices-1;i++){
//            reach all edges
            for(int j=0;j<graph.size();j++){
                Edge e=graph.get(j);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

//                relaxation step
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                    dist[v]=dist[u]+wt;
                }
            }
        }

        for(int i:dist){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int vertices=5;
        ArrayList<Edge> [] graph=new ArrayList[vertices];
        ArrayList<Edge> graph2=new ArrayList<>();
        createGraph(graph);
        createGraph2(graph2);
        bellmanFord(graph,0);
        bellmanFord2(graph2,0,vertices);
    }
}
