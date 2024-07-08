public class NQueens {
    private static int count=0;
    public static void nQueens(char board[][],int row){
//        BASE CASE
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1); //RECURSIVE FUNCTION CALL
//            EK ROW MEI EK HI QUEEN AYEGI ISLIYE BAITHI HUI QUEEN KO UTHAKE DOOSRI PLACE PE RKHNA RHEGA NA KI USKE HI ROW MEI KISI DOORE COLUMN MEI QUEEN RKHENGE
                board[row][j]='x'; //BACKTRACKING STEP
            }
        }
    }
    public static boolean isSafe(char board[][], int row, int col){
//        CHECK FOR VERTICALLY UPWARD DIRECTION THAT IS IN THE SAME COLUMN BUT PREVIOUS ROWS
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
//        CHECK FOR LEFT-UP DIAGONAL DIRECTION THAT IS DECREASE ROWS AND COLUMNS BY 1
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
//        CHECK FOR RIGHT-UP DIAGONAL DIRECTION THAT IS DECREASE ROWS BUT INCREASE COLUMNS BY 1
        for(int i=row-1, j=col+1; i>=0 && j<=board[i].length-1; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char arr[][]){
        System.out.println("CHESS-BOARD");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
//        INITIALISE THE ARRAY
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0);
        System.out.println("Total ways to solve N Queens = "+count);
    }
}
