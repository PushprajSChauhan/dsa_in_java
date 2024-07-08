import java.util.Arrays;

public class KadanesAlgorithm {
    public static void kadanes(int nums[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
//        FOR THE CASE WHEN ALL ELEMENTS ARE NEGATIVE
        if(maxSum==0){
            Arrays.sort(nums);
            maxSum=nums[nums.length-1];
        }
        System.out.println("Max sum is "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
