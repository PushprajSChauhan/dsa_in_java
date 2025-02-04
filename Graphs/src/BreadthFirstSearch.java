import java.util.*;
public class BreadthFirstSearch {
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

    public static void bfs(ArrayList<Edge> [] graph){
        Queue<Integer> queue=new LinkedList<>();
        boolean [] visited=new boolean[graph.length];
        queue.add(0); //source is 0

        while(queue.isEmpty()==false){
            int current=queue.remove();
            if(visited[current]==false){
                System.out.print(current+" "); //print vertex
                visited[current]=true; //make its visited true
                for(int i=0;i<graph[current].size();i++){ //add its neighbors in queue
                    Edge e=graph[current].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices=7;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        createGraph(graph);
        bfs(graph);
    }
}