import java.util.Scanner;

public class SearchIn2DArray {
    public static boolean searchMatrix(int matrix[][],int key){
        int n= matrix.length;
        int m=matrix[0].length;
        for(int i=0;i< n;i++){
            for(int j=0;j< m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n= matrix.length; //TO GET NUMBER OF ROWS
        int m=matrix[0].length; //TO GET NUMBER OF COLUMNS
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
        searchMatrix(matrix,5);
    }
}
