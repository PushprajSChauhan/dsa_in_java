public class EvenOdd {
    public static void evenOdd(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        evenOdd(2);
        evenOdd(3);
        evenOdd(15);
        evenOdd(12);
    }
}
