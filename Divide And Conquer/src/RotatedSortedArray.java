public class RotatedSortedArray {
    public static int searchInRSArray(int arr[], int target, int start, int end){
//        BASE CASE
        if(start>end){
            return -1;
        }
//        KAAM JO ISS FUNCTION CALL PR KRWANA HAI AND CALL TO INNER FUNCTIONS
        int mid=start+(end-start)/2;
//        IF TARGET FOUND ON MID INDEX ONLY
        if(arr[mid]==target){
            return mid;
        }
//        WHEN MID ELEMENT IS ON LINE 1
        if(arr[start]<=arr[mid]){
//            CASE 1: TO SEARCH ON LEFT OF MID ELEMENT
            if(arr[start]<=target && target<=arr[mid]){
                return searchInRSArray(arr,target,start,mid-1);
            }
//            CASE 2: TO SEARCH ON RIGHT OF MID ELEMENT
            else{
                return searchInRSArray(arr,target,mid+1,end);
            }
        }
//        WHEN MID ELEMENT IS ON LINE 2
        else{
//            CASE 3: TO SEARCH ON RIGHT OF MID ELEMENT
            if(arr[mid]<=target && target<=arr[end]){
                return searchInRSArray(arr,target,mid+1,end);
            }
//            CASE 4: TO SEARCH ON LEFT OF MID ELEMENT
            else{
                return searchInRSArray(arr,target,start,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(searchInRSArray(arr,target,0,arr.length-1));
    }
}
