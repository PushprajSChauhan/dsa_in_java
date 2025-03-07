import java.util.*;
public class DepthFirstSearch {
    static class Edge{
        int src,dest,wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }

    public static void dfs(ArrayList<Edge> [] graph){
        boolean [] visited=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            dfsUtil(graph,i,visited);
        }
    }

    public static void dfsUtil(ArrayList<Edge> [] graph, int current, boolean vis[]){
//        visit the current vertex
        System.out.print(current+" ");
        vis[current]=true;

//        recursive call for neighboring vertices
        for(int i=0;i<graph[current].size();i++){
            Edge e=graph[current].get(i);
            if(vis[e.dest]==false){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }

    public static void main(String[] args) {
        int vertices=7;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        createGraph(graph);
        dfs(graph);
    }
}
