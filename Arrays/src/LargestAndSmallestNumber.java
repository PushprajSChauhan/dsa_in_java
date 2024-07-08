public class LargestAndSmallestNumber {
    public static void getLargestAndSmallest(int [] nums){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        System.out.println("Smallest number is "+smallest);
        System.out.println("Largest number is "+largest);
    }

    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        getLargestAndSmallest(numbers);
    }
}
