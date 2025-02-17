import java.util.ArrayList;

public class SourceToTargetPaths {
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,3));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int tar, String path){
//        BASE CASE
        if(src==tar){
            System.out.println(path+" "+tar);
            return;
        }

        for (int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            printAllPaths(graph,e.dest,tar,path+" "+src);
        }
    }
    public static void main(String[] args) {
        int vertices=7;
        ArrayList<Edge> [] graph=new ArrayList[vertices];
        createGraph(graph);

        int src=5,tar=1;
        printAllPaths(graph,src,tar,"");
    }
}
