public class SortedArray {
    public static boolean isSorted(int arr[],int i){
//        BASE CASE
        if(i==arr.length-1){
            return true; //AS NO MORE ELEMENTS ARE LEFT TO COMPARE
        }
//        KAAM JO ISS FUNCTION CALL KO KRNA HAI
        if(arr[i]>arr[i+1]){
            return false;
        }
//        CALL TO FUNCTION FOR SMALLER VALUES
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(isSorted(arr,0));
    }
}
