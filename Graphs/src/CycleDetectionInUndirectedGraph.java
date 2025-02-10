import java.util.*;
public class CycleDetectionInUndirectedGraph {
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }

    public static boolean detectCycle(ArrayList<Edge> [] graph){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){
                if(detectCycleUtil(graph,i,-1,vis)){
                    //source vertex ka parent nahi hota isliye -1 bheja hai
                    return true; //cycle exists in atleast one of the graph components
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> [] graph, int current, int parent, boolean [] visited){
        visited[current]=true;

        for(int i=0;i<graph[current].size();i++){
            Edge e=graph[current].get(i);
//              CASE 1
            if(visited[e.dest] && e.dest!=parent){
                return true;
            }
//            CASE 3
            else if(visited[e.dest]==false){
                if(detectCycleUtil(graph,e.dest,current,visited))
                {    return true;   }
                return true;
            }
//            FOR CASE 2 WE HAVE TO DO NOTHING AND LET THE LOOP CONTINUE
        }
        return false;
    }
    public static void main(String[] args) {
        int vertices=5;
        ArrayList<Edge> [] graph=new ArrayList[vertices];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
