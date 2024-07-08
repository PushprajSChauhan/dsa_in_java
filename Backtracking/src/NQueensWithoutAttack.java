public class NQueensWithoutAttack {
    public static void nQueensWithoutAttack(char board[][],int row){
//        BASE CASE
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueensWithoutAttack(board,row+1); //RECURSIVE FUNCTION CALL
//            EK ROW MEI EK HI QUEEN AYEGI ISLIYE BAITHI HUI QUEEN KO UTHAKE DOOSRI PLACE PE RKHNA RHEGA NA KI USKE HI ROW MEI KISI DOORE COLUMN MEI QUEEN RKHENGE
            board[row][j]='x'; //BACKTRACKING STEP
        }
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
        int n=2;
        char board[][]=new char[n][n];
//        INITIALISE THE ARRAY
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueensWithoutAttack(board,0);
    }
}
