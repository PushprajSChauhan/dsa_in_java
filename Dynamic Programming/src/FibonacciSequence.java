public class FibonacciSequence {
    public static int fib(int n, int[] f){
//        DP BASED APPROACH
        if(n==0 ||n==1){
            return n;
        }
        if(f[n]!=0){
//            this means the value for that index is already calculated so just return it directly rather than making further calls for it
            return f[n];
        }
        f[n]=fib(n-1,f)+fib(n-2,f); //store the value calculated for the higher/upper levels rather than returning it directly
        return f[n];
    }

    public static int tab(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        int f[]=new int[n+1]; // from 0 to n so the last value will be our answer i.e. fib(n)=f[n]
        System.out.println(fib(n,f));
        System.out.println(tab(n));
//        due to the usage of dynamic programming the time complexity has been reduced from exponential to linear
    }
}