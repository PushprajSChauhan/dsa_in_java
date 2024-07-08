import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n=4,m=6;
//        TOTAL VERTICAL CUTS WILL BE M-1 WHERE M IS NUMBER OF COLUMNS
        Integer costVerCut[]={2,1,3,1,4};
//        TOTAL HORIZONTAL CUTS WILL BE N-1 WHERE N IS NUMBER OF ROWS
        Integer costHorCut[]={4,1,2};

//        SORT THE COSTS SEPARATELY
        Arrays.sort(costVerCut, Collections.reverseOrder());
        Arrays.sort(costHorCut, Collections.reverseOrder());
//        TAKE POINTERS TO TRAVERSE THROUGH ARRAYS AND MAKE BIGGER CUTS FIRST
        int hor=0,ver=0;
//        COUNT THE PIECES FORMED AFTER EACH CUT
        int horPieces=1,verPieces=1;
        int totalCost=0;
        while(hor<costHorCut.length && ver< costVerCut.length){
//            CASE 1 WHEN THE VERTICAL CUT IS MADE FIRST BCOS VERTICAL CUT COST > HORIZONTAL CUT COST
            if(costVerCut[ver]>=costHorCut[hor]){
                totalCost+=costVerCut[ver]*horPieces;
                verPieces++;
                ver++;
            }
//            CASE 2 WHEN THE HORIZONTAL CUT IS MADE FIRST BCOS HORIZONTAL CUT COST > VERTICAL CUT COST
            else{
                totalCost+=costHorCut[hor]*verPieces;
                horPieces++;
                hor++;
            }
        }
        while(hor<costHorCut.length){
            totalCost+=costHorCut[hor]*verPieces;
            horPieces++;
            hor++;
        }
        while(ver<costVerCut.length){
            totalCost+=costVerCut[ver]*horPieces;
            verPieces++;
            ver++;
        }
        System.out.println("Min cost of cuts "+totalCost);
    }
}
