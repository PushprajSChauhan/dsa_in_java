public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swapCount=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapCount++;
                }
            }
            if(swapCount==0){
                return;
            }
        }
    }

    public static void print(int arr[]){
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
        int brr[]={3,4,5,6,7,8,9};
        bubbleSort(arr);
        bubbleSort(brr);
        print(arr);
    }
}