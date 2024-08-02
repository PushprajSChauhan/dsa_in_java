public class ElementIndexinInfiniteArray {
//    infinite array mtlb array ki length ka use nhi krna h problem ko solve krne mei
    public static void main(String[] args) {
        int [] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
//        operate on the boxes of increasing size
//        start with the box of size 2 and double it eventually
        int start=0;
        int end=1;

//        condition for the target to lie in range
        while(target>arr[end]){
            int newstart=end+1;
//            double the size of box
//            end=previous end+size of old box*2
            end=end+(end-start+1)*2;
//            start ko phle update nhi krenge by newstart bcos usse use krna tha new end mei
            start=newstart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
//            find middle element to compare with target
//            int mid=(start+end)/2; yaha (start+end) se problem hoskti hai agar integer ki range cross hogi toh
            int mid = start + (end - start) / 2; //from this logic there will be no case where int range will be crossed

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
