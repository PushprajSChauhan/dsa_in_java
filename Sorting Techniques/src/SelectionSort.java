public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
//                    FOR SORTING IN DESCENDING ORDER WE WILL USE arr[minPos]<arr[j]
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,3,1,4,2};
        selectionSort(arr);
        print(arr);
    }
}
