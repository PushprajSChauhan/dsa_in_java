public class DisjointSet {
    static int n=7;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for (int i = 0; i < n; i++) {
            par[i]=i;
        }
    }

    public static int findLeader(int x){
        if(x==par[x]){
            return x;
        }

        return par[x]=findLeader(par[x]); //par[x] mei ham directly final/topmost leader ki value store krlenge rather than calling the function for finding same value's parent repeatedly, this is called PATH COMPRESSION and iss se tree ki height kam ho jayegi
    }

    public static void union(int a, int b){
        int parA=findLeader(a);
        int parB=findLeader(b);

        if(rank[parA]==rank[parB]){
//            kisiko bhi doosre ka parent bana do
            par[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }
        else{
            par[parB]=parA;
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println(findLeader(5));
        union(1,3);
        System.out.println(findLeader(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(findLeader(3));
        System.out.println(findLeader(4));
        union(1,5);
    }
}
