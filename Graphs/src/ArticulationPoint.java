import java.util.ArrayList;

public class ArticulationPoint {
    static class Edge{
        int src,dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph){
        for(int i=0;i<graph.length;i++){
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

    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int dt[], int low[], int time, boolean [] vis, boolean [] ap){
        vis[curr]=true;
        dt[curr]=low[curr]=++time;

        int children=0;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            int neighbor=e.dest;

//            case 1: when neighbor is our parent and is already visited
            if(neighbor==par){
                continue;
            }

//            case 2: when neighbor is visited but not our parent
            else if (vis[neighbor]) {
                low[curr]=Math.min(low[curr],dt[neighbor]);
            }

//            case 3: when neighbor is unvisited
            else{
                dfs(graph,neighbor,curr,dt,low,time,vis,ap);
                low[curr]=Math.min(low[curr],low[neighbor]);
//                check for articulation point
                if(par!=-1 && dt[curr]<=low[neighbor]){
//                    System.out.println("Articulation point is "+curr);
                    ap[curr]=true;
                }
                children++;
            }
        }

        if(par==-1 && children>1){
//            System.out.println("Articulation point is "+curr);
            ap[curr]=true;
        }
    }

    public static void getArticulationPoint(ArrayList<Edge> [] graph, int V){
        int dt[]=new int[V];
        int low[]=new int[V];

        int time=0;
        boolean[] visited=new boolean[V];

        boolean ap[]=new boolean[V]; //to track the articulation points so that none of them is repeated

        for (int i = 0; i < V; i++) {
            if(visited[i]==false){
                dfs(graph,i,-1,dt,low,time,visited,ap);
            }
        }

//        to print all articulation points
        for (int i = 0; i < ap.length; i++) {
            if(ap[i]){
                System.out.println("Articulation point is "+i);
            }
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> [] graph=new ArrayList[V];

        createGraph(graph);
        getArticulationPoint(graph,V);
    }
}
