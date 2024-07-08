public class SudokuSolver {
    public static boolean sudokuSolver(int arr[][], int row, int col){
//        BASE CASE
        if(row==9){
            return true;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI AND CALL TO INNER FUNCTIONS
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }

//        AGAR KOI CELL PE ALREADY KOI DIGIT PRESENT HAI TOH NEXT CELL KE LIYE CALL LAGAYENGE
        if(arr[row][col]!=0){
            return sudokuSolver(arr,nextRow,nextCol);
        }
//        JINN DIGITS KO PLACE KRNA HAI UNKE LIYE YEH CODE RHEGA
        for(int digit=1;digit<=9;digit++){
//            HAR ITERATION MEI ISS DIGIT KO ROW,COL CELL PE PLACE KRNE KI KOSHISH KRNA HAI
            if(isCorrect(arr,row,col,digit)){
                arr[row][col]=digit;
                if(sudokuSolver(arr,nextRow,nextCol)){
                    return true;
                }
                arr[row][col]=0; //BACKTRACKING STEP
            }
        }
        return false;
    }

    public static boolean isCorrect(int arr[][], int row, int col, int digit){
//        CHECK THE OCCURENCE OF DIGIT IN COLUMN
        for(int i=0;i<=8;i++){
            if(arr[i][col]==digit){
                return false;
            }
        }
//        CHECK THE OCCURENCE OF DIGIT IN ROW
        for(int j=0;j<=8;j++){
            if(arr[row][j]==digit){
                return false;
            }
        }
//        CHECK THE OCCURENCE OF DIGIT IN GRID
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(arr[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0}
                ,{4,9,0,1,5,7,0,0,2}
                ,{0,0,3,0,0,4,1,9,0}
                ,{1,8,5,0,6,0,0,2,0}
                ,{0,0,0,0,2,0,0,6,0}
                ,{9,6,0,4,0,5,3,0,0}
                ,{0,3,0,0,7,2,0,0,4}
                ,{0,4,9,0,3,0,0,5,7}
                ,{8,2,7,0,0,9,0,1,3}
        };
        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exist");
        }
    }
}
