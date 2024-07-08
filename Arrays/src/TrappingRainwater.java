public class TrappingRainwater {
    public static int trapRainwater(int nums[]){
        int n=nums.length;
//        CALCULATE LEFT MAX BOUNDARY AS HELPER ARRAY
        int leftMax[]=new int[n];
        leftMax[0]=nums[0];
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(nums[i],leftMax[i-1]);
        }
//        CALCULATE RIGHT MAX BOUNDARY AS HELPER ARRAY
        int rightMax[]=new int[n];
        rightMax[n-1]=nums[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i]=Math.max(nums[i],rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0;i<n;i++){
//        CALCULATE WATER LEVEL BY GETTING MINIMUM OF THE BOUNDARIES OF THAT BAR
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
//        TRAPPED WATER = WATER LEVEL - HEIGHT OF THAT BAR
            trappedWater=trappedWater+waterLevel-nums[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int volume=trapRainwater(height);
        System.out.println(volume);
    }
}
