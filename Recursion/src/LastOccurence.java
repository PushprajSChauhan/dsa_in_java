public class LastOccurence {
    public static int lastOccurence(int arr[], int i, int key){
//        BASE CASE
        if(i<0){
            return -1;
        }
//        KAAM JO ISS FUNCTION CALL PE KRNA HAI
        if(arr[i]==key){
            return i;
        }
//        CALL TO FUNCTION FOR SMALLER OR FURTHER VALUES
        return lastOccurence(arr,i-1,key);
    }

    public static int lastOccurence1(int brr[], int i, int key){
//        BASE CASE
        if(i==brr.length){
            return -1;
        }
//        CALL FOR CHECKING THE VALUES AFTER THE FIRST OCCURENCE INDEX
        int isFound=lastOccurence1(brr,i+1,key);
//        KAAM JO ISS FUNCTION CALL KO KRNA HAI
        if(isFound==-1 && brr[i]==key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arr,arr.length-1,5));
        System.out.println(lastOccurence1(arr,0,5));
    }
}
