public class CountingSort {
    public static void countingSort(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest,nums[i]);
        }
//        COUNTING THE FREQUENCY OF EACH ELEMENT OF THE NUMS ARRAY
        int countArr[]=new int[largest+1]; //TO INCLUDE 0 ALSO WE ADD 1 IN THE RANGE OF ELEMENTS OF NUMS ARRAY
        for(int i=0;i< nums.length;i++){
            countArr[nums[i]]++;
        }
//        SORTING THE ARRAY
        int j=0;
        for(int i=0;i<countArr.length;i++){
            while(countArr[i]>0){
                nums[j]=i;
                j++;
                countArr[i]--;
            }
        }
    }
    public static void print(int nums[]){
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,4,1,3,2,4,3,7};
        countingSort(numbers);
        print(numbers);
    }
}
