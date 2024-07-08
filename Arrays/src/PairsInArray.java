public class PairsInArray {
    public static void printPairs(int nums[]){
        int totalPairs=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+nums[i]+","+nums[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.print(totalPairs);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }
}
