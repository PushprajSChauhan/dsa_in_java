import java.util.*;
public class TopologicalSorting {
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

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void topoSort(ArrayList<Edge> [] graph){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topoSortUtil(graph,i,vis,s); //modified DFS
            }
        }

        while(s.isEmpty()==false){
            System.out.print(s.pop()+" ");
        }
    }

    public static void topoSortUtil(ArrayList<Edge>[] graph, int curr, boolean [] vis, Stack<Integer> s){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(vis[e.dest]==false){
                topoSortUtil(graph,e.dest,vis,s);
            }
        }

        s.push(curr);
    }

    public static void topoSortBFS(ArrayList<Edge> [] graph){
//        calculate the in-degree of the graph
        int[] in_degree =new int[graph.length];
        calcInDegree(graph,in_degree);
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<in_degree.length;i++){
            if(in_degree[i]==0){
                q.add(i);
            }
        }

//        bfs part
        while (q.isEmpty()==false){
            int curr=q.remove();
            System.out.print(curr+" ");
//            reduce the in-degree of neighbor nodes by 1
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                in_degree[e.dest]--;
                if(in_degree[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }

        System.out.println();
    }

    public static void calcInDegree(ArrayList<Edge>[] graph, int[] in_degree){
        for(int i=0;i<graph.length;i++){
            int vertex=i;
            for(int j=0;j<graph[vertex].size();j++){
                Edge e=graph[vertex].get(j);
                in_degree[e.dest]++;
            }
        }
    }

    public static void main(String[] args) {
        int vertices=6;
        ArrayList<Edge> [] graph=new ArrayList[vertices];
        createGraph(graph);
        topoSort(graph); //using DFS
        topoSortBFS(graph); //using BFS
    }
}
