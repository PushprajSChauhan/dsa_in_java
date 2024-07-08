public class MaxMinSubarray {
    public static void maxMinSubarraySum(int nums[]){
        int totalSubarrays=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for (int j = i; j < nums.length; j++) {
                int end=j;
                int currSum=0;
                for (int k = start; k <=end ; k++) {
//                    System.out.print(nums[k]+" ");
                    currSum=currSum+nums[k];
                }
                totalSubarrays++;
//                System.out.println("(Sum of subarray is "+currSum+")");
                if(currSum>maxSum){
                    maxSum=currSum;
                }
                if(currSum<minSum){
                    minSum=currSum;
                }
            }
//            System.out.println();
        }
        System.out.println("Total subarrays formed "+totalSubarrays);
        System.out.println("Maximum sum of all subarrays is "+maxSum+", Minimum sum of all subarrays is "+minSum);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxMinSubarraySum(numbers);
    }
}
