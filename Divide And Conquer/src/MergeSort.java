public class MergeSort {
    public static void mergeSort(int arr[], int start, int end){
//        BASE CASE
        if(start>=end){
            return;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI AND CALL TO INNER FUNCTION
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid); //FOR SORTING THE LEFT PART COMPLETELY
        mergeSort(arr,mid+1,end); //FOR SORTING THE RIGHT PART COMPLETELY
//        NOW MERGE THE SORTED PARTS
        merge(arr,start,mid,end);
    }

    public static void merge(int arr[], int start, int mid, int end){
        int temp[]=new int[end-start+1];
        int i=start; //ITERATOR FOR LEFT PART
        int j=mid+1; //ITERATOR FOR RIGHT PART
        int k=0; //ITERATOR FOR TEMP ARRAY
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
//                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
//                k++;
            }
            k++;
        }
//        FOR LEFT OVER ELEMENTS OF LEFT PART
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
//        FOR LEFT OVER ELEMENTS OF RIGHT PART
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }
//        COPY TEMP ARRAY TO ORIGINAL ARRAY
        for(k=0,i=start;k< temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}