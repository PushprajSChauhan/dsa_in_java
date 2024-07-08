public class FirstOccurence {
    public static int firstOccurence(int arr[],int i, int key){
//        BASE CASE
        if(i==arr.length){
            return -1;
        }
//        KAAM JO ISS FUNCTION CALL PE KRNA HAI
        if(arr[i]==key){
            return i;
        }
//        CALL TO FUNCTION FOR SMALLER OR FURTHER VALUES
        return firstOccurence(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr,0,7));
    }
}
