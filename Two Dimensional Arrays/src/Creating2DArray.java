import java.util.Scanner;

public class Creating2DArray {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n= matrix.length; //TO GET NUMBER OF ROWS
        int m= matrix[0].length; //TO GET NUMBER OF COLUMNS
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=kb.nextInt();
            }
        }
        for(int i=0;i< n;i++){
            for(int j=0;j< m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}