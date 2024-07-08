import java.util.Scanner;

public class MaxMinInMatrix {
    public static int[] findMaxAndMin(int matrix[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        return new int[]{max,min};
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
        int ans[]=findMaxAndMin(matrix);
        System.out.println("Max element is "+ans[0]);
        System.out.println("Min element is "+ans[1]);
    }
}
