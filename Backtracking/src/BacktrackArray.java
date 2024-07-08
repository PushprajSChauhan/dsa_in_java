public class BacktrackArray {
    public static void changeArray(int arr[], int index, int val){
//        BASE CASE
        if(index==arr.length){
            printArr(arr);
            return;
        }
//        KAAM JO ISS FUNCTION CALL SE KRWANA HAI
        arr[index]=val;
//        CALL TO INNER FUNCTION
        changeArray(arr,index+1,val+1);
//        BACTRACKING STEP
        arr[index]=arr[index]-2;
    }
    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArray(arr,0,1);
        printArr(arr);
    }
}