public class EvenDigitsinNumber {
    public static void main(String[] args) {
        int [] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
        System.out.println(digits(485));
        System.out.println(digits(-23525));
        System.out.println(digits(0));
        System.out.println(digits1(345678));
        System.out.println(even(345345));
    }
    static int findNumbers(int [] nums){
//        yeh count variable check krega array ke elements ka count jo even digits wale hain
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

//    count number of digits
    static int digits(int num) {
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int digitscount=0;
        while(num>0){
            digitscount++;
            num=num/10;
        }
        return digitscount;
    }

//    shortcut to find digits in a number
//    int of log10 value of that number plus 1
    static int digits1(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }

//    function to check whether the number has even digits or not
    static boolean even(int num) {
//        yaha number ko string banake uski length dekh ke bhi check krskte hain
//        ham digits count krenge number mei
        int ans=digits(num);
        if(ans%2==0){
            return true;
        }
        return false;
    }
}
