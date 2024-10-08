public class LinearSearch {
    public static int linearSearch(int nums[],int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=20;
        int index=linearSearch(numbers,key);
        if(index==-1){
            System.out.println("Key NOT found");
        }
        else{
            System.out.println("Key is at index "+index);
        }
    }
}
