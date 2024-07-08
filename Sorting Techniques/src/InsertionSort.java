public class InsertionSort {
    public static void insertionSort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;
//            FINDING OUT THE CORRECT POSITION TO INSERT THE ELEMENT
            while(prev>=0 && nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
//            ACTUAL INSERTION PROCESS
            nums[prev+1]=curr;
        }
    }
    public static void print(int arr[]){
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,2,1,3};
        insertionSort(numbers);
        print(numbers);
    }
}
