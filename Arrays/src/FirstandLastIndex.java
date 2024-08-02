import java.util.Arrays;

public class FirstandLastIndex {
    public static void main(String[] args) {
        int [] arr={34,3,34,5,3,4,4,5,32};
        int target=3;
        int[] indexes = searchRange(arr, target);
        System.out.println(Arrays.toString(indexes));
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
//        int start=search(nums,target,true);
//        int end=search(nums,target,false);
//        ans[0]=start;
//        ans[1]=end;
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
//            ans[0]=-1 mtlb target is not present in the array
            ans[1]=search(nums,target,false);
        }
        return ans;
    }

//    this function just gives us the index values of target, do baar call krenge extreme indexes pta krne ke liye
    public static int search(int[] nums, int target, boolean findStartIndex){
        int ans=-1;

        int start=0;
        int end=nums.length-1;
        while(start<=end){
//            find middle element to compare with target
//            int mid=(start+end)/2; yaha (start+end) se problem hoskti hai agar integer ki range cross hogi toh
            int mid=start+(end-start)/2; //from this logic there will be no case where int range will be crossed

            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else
//                potential answer is found, the actual indexes may lie on futher sides of this answer
                ans=mid;
                if(findStartIndex==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
        }
        return ans;
    }
}
