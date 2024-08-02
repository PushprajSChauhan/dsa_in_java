public class MountainArray {
//    in other words it is just to find the maximum number in array if it is unique
    public static void main(String[] args) {

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
//                we are in decreasing part of array
//                this element may be the peak, but look at left to get a probable bigger element
//                thats why end shld not be on left of mid
                end=mid;
            }
            else{
//                we are in increasing part of array
//                toh next element iss element se bada hi hoga isliye seedhe next element pe start ko rkhenge
                start=mid+1;
            }
        }
//        here start==end pointing to the largest element in array
//        start and end are trying to find the max element
//        when they are at same index means it is the largest element
        return start;
    }
}
