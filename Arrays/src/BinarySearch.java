public class BinarySearch {
    public static int binarySearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
//            CALCULATE MID
//            int mid=start+(end-start)/2;
            int mid=(start+end)/2;
//            KEY FOUND
            if(numbers[mid]==key){
                return mid;
            }
//            KEY IN LEFT
            if(numbers[mid]>key){
                end=mid-1;
            }
//            KEY IN RIGHT
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14,16};
        int key=10;
        System.out.println("index of key in array is "+binarySearch(nums,key));
    }
}
