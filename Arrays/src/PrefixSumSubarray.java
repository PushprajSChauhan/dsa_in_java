public class PrefixSumSubarray {
    public static void prefixSumSubarray(int nums[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];

//        INITIALIZE THE PREFIX ARRAY
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i< nums.length;i++){
            int start=i;
            for (int j = i; j < nums.length; j++) {
                int end=j;
                currSum=(start==0)?prefix[end]:(prefix[end]-prefix[start-1]);
                maxSum=Math.max(currSum,maxSum);
            }
        }
        System.out.println("max sum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        prefixSumSubarray(numbers);
    }
}
