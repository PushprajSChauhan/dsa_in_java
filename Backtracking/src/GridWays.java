public class GridWays {
    public static int gridWays(int r, int c, int n, int m){
//        BASE CASE
        if(r==n-1 && c==m-1){
//            WE ARE NOW AT TARGET OR DESTINATION CELL
            return 1;
        } else if(r>=n || c>=m){
//            WHEN THE CASE OF CROSSING BOUNDARY OCCURS AND WE CANNOT GO RIGHT OR DOWN ANYMORE TO REACH TARGET CELL
            return 0;
        }
//        KAAM JO ISS FUNCTION SE KRWANA HAI AND CALL TO INNER FUNCTIONS
        int way1=gridWays(r+1,c,n,m); //FOR CHOOSING DOWNWARD MOVEMENT
        int way2=gridWays(r,c+1,n,m); //FOR CHOOSING RIGHTWARD MOVEMENT
        return way1+way2;
    }

    public static int fact(int a){
        if(a<0){
            return -1;
        }
//        BASE CASE
        if(a==0){
            return 1;
        }
//        FUNCTION KO YAHI SE CALL KRKE CHOTE WALE NUMBER KA FACTORIAL NIKAL KR USSE FACT MEI USE KRSKTE THE
//        KAAM JO ISS FUNCTION CALL KO KRNA HAI AND CALL TO NEXT FUNCTION
        int fact=a*fact(a-1);
        return fact;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(0,0,n,m));
        System.out.println((fact(n-1+m-1))/(fact(n-1)*fact(m-1))); //THIS SHORT TRICK USING PERMUTATION GIVES THE TIME COMPLEXITY OF O(n+m)
    }
}
