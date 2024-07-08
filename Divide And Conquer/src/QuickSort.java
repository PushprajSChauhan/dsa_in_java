public class QuickSort {
    public static void quickSort(int arr[], int start, int end){
//        BASE CASE
        if(start>=end){
            return;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI
//        CHOOSING THE LAST ELEMENT AS PIVOT
        int pivotIndex=partition(arr,start,end);
//        LEFT PART KO SORT KRNA
        quickSort(arr,start,pivotIndex-1);
//        RIGHT PART KO SORT KRNA
        quickSort(arr,pivotIndex+1,end);
    }

    public static int partition(int arr[],int start, int end){
        int pivot=arr[end];
        int i=start-1; //PIVOT SE CHOTE ELEMENTS KE LIYE JAGAH BANANA
        for (int j = start; j < end; j++) { //j KO TAB TK CHALAYENGE JAB TAK PIVOT KE INDEX SE CHOTA H j
            if(arr[j]<=pivot){
//                ELEMENT CHOTA HAI PIVOT SE TOH USKE LIYE JAGAH BANAYENGE
                i++;
//                SWAP
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
//        AB PIVOT SE CHOTE ELEMENTS ARRANGE HOGYE HAIN, TOH PIVOT KO ARRANGE KRDENGE TOH USSE BADE ELEMENTS BHI ARRANGE HO JAYENGE
        i++;
        int temp=pivot;
        arr[end]=arr[i]; //pivot=arr[i] NAHI LIKHENGE BCOS ISSE VARIABLE KI VALUE CHANGE HOGI SIRF AND NOT OF ARRAY
        arr[i]=temp;
        return i; //PIVOT KA SAHI INDEX
    }
    public static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
