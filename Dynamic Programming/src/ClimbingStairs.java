import java.util.ArrayList;
import java.util.Arrays;

public class ClimbingStairs {
    public static int climbStairsRecursive(int n){
        if(n==0){
//            we are on ground-floor so move nowhere which is considered as 1 way
            return 1;
        }
        if(n<0){
            return 0;
        }
        return climbStairsRecursive(n-1)+climbStairsRecursive(n-2);
    }

    public static int climbStairsMemoization(int n, int [] ways){
        if(n==0){
//            we are on ground-floor so move nowhere which is considered as 1 way
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(ways[n]!=-1){
//            already the value is being calculated for the given n so no need for further calls to its lower levels
            return ways[n];
        }
        ways[n]=climbStairsMemoization(n-1,ways)+climbStairsMemoization(n-2,ways);
        return ways[n];
    }

    public static int climbStairsTabulation(int n){
        int ways[]=new int[n+1];
        ways[0]=1;

        for(int i=1;i<=n;i++){
            if(i==1){
                ways[i]=ways[i-1]+0;
            }
            else {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }

        return ways[n];
    }
    public static void main(String[] args) {
        int n=5;
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(climbStairsRecursive(n));
        System.out.println(climbStairsMemoization(n,ways));
        System.out.println(climbStairsTabulation(n));
    }
}
