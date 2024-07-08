public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
//        <= USE NAHI KRENGE TOH AISE MATRICES KA CENTRE ELEMENT MISS HO JAYEGA JO ODD ROWS x ODD COLS FORM MEI HOTE HAIN
//        && USE KRENGE KYOKI ROW AND COLUMN MEI SE JO MINIMUM HOGA IN N x M MATRIX VOH DECIDE KREGA KI LOOP KITNI BAAR RUN HOGA KISI BHI ROW YA COLUMN KE LIYE
//        && USE NAHI KRENGE TOH EK HI ROW YA COLUMN KE DUPLICATES PRINT HO JAYENGE
        while (startRow <= endRow && startCol <= endCol) {
//            PRINT TOP ROW
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
//            PRINT RIGHT COL
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
//            PRINT BOTTOM ROW
            for (int j = endCol - 1; j >= startCol; j--) {
//                CHECK IF THE ELEMENT IS ALREADY PRINTED BY TOP ROW OR NOT
                if (startRow == endRow) {
                    break;
//                    USS ELEMENT KO FIRSE PRINT NAHI KRWANA H JO ALREADY TOP ROW NE PRINT KRDIYA HAI
                }
                System.out.print(matrix[endRow][j]+" ");
            }
//            PRINT LEFT COL
            for (int i = endRow - 1; i >= startRow+1; i--) {
//                CHECK IF THE ELEMENT IS ALREADY PRINTED BY RIGHT COL OR NOT
                if (startCol == endCol) {
                    break;
//                    USS ELEMENT KO FIRSE PRINT NAHI KRWANA H JO ALREADY RIGHT COLUMN NE PRINT KRDIYA HAI                }
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        printSpiral(matrix);
    }
}
