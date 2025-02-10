import java.util.*;
public class BipartiteGraphCheck {
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

       graph[1].add(new Edge(1,0));
       graph[1].add(new Edge(1,3));

       graph[2].add(new Edge(2,0));
       graph[2].add(new Edge(2,4));

       graph[3].add(new Edge(3,1));
       graph[3].add(new Edge(3,4));

       graph[4].add(new Edge(4,2));
       graph[4].add(new Edge(4,3));
    }

    public static boolean isBipartite(ArrayList<Edge> [] graph){
        int color[]=new int[graph.length];
        for(int i=0;i<color.length;i++){
             color[i]=-1;//initialize for indicating not colored vertices
        }

        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
//                perform BFS for every graph component
                queue.add(i);
                color[i]=0;
                while(!queue.isEmpty()){
                    int curr=queue.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        if(color[e.dest]==-1){
//                            ASSIGN COLOR TO NON-COLORED VERTEX
                            int neighborColor=color[curr]==0?1:0;
                            color[e.dest]=neighborColor;
                            queue.add(e.dest);
                        }
                        else if(color[e.dest]==color[curr]){
                            return false; //GRAPH IS NOT BIPARTITE
                        }
//                        FOR OPPOSITE COLOR OF NEIGHBOR NODE CONTINUE THE LOOP
                    }
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int vertices=5;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
