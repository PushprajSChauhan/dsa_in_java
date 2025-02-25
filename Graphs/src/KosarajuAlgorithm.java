import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgorithm {
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }

    public static void topoSort(ArrayList<Edge> [] graph, int curr, boolean vis[], Stack<Integer> s){
        vis[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                topoSort(graph,e.dest,vis,s);
            }
        }

        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> [] graph, int curr, boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph,e.dest,vis);
            }
        }
    }

    public static void kosarajuAlgo(ArrayList<Edge> [] graph, int V){
//        step 1: topological sorting
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[V];

        for(int i=0;i<V;i++){
            if(vis[i]==false){
                topoSort(graph,i,vis,s);
            }
        }

//        step 2: transpose graph
        ArrayList<Edge> [] transpose=new ArrayList[V];
        for(int i=0;i<V;i++){
            vis[i]=false; //to perform DFS correctly on transpose graph
            transpose[i]=new ArrayList<>();
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src)); //edge reversal
            }
        }

//        step 3: perform DFS
        while(!s.isEmpty()){
            int curr=s.pop();
            if(vis[curr]==false){
                System.out.println("SCCs are ");
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);

        kosarajuAlgo(graph,V);
    }
}
