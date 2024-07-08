public class ReverseArray {
    public static void reverse(int nums[]){
        int first=0,last=nums.length-1;
        while(first<last){
            int temp=nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
