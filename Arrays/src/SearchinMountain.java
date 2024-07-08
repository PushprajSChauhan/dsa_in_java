package ArrayQuesLeetCode;

public class SearchinMountain {
    public static void main(String[] args) {

    }

    static int search(int [] arr,int target){
        int peak=findInMountainArray(arr);
        int firstTryinAscend=orderAgnosticBS(arr,target,0,peak);
        if(firstTryinAscend!=-1){
            return firstTryinAscend;
        }
        int secondTryinDescend=orderAgnosticBS(arr,target,peak+1,arr.length-1);
        if(secondTryinDescend!=-1){
            return secondTryinDescend;
        }
        return -1;
    }

    static int orderAgnosticBS(int [] arr,int target,int start,int end){
       boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static int findInMountainArray(int [] arr) {
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
