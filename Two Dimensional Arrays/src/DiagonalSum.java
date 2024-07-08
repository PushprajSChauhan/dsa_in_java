public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
//        BRUTE FORCE APPROACH
//        for (int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(i==j){
//                    sum=sum+matrix[i][i];
//                }
//                else if(j==matrix.length-1-i){
//                    sum=sum+matrix[i][j];
//                }
//            }
//        }
        for(int i=0;i<matrix.length;i++){
//            PRIMARY DIAGONAL
            sum=sum+matrix[i][i];
//            SECONDARY DIAGONAL
//            THIS WILL ONLY BE EXECUTED WHEN THE ELEMENT WILL BE ON SECONDARY DIAGONAL BUT NOT ON PRIMARY DIAGONAL
            if(i!=matrix.length-1-i){
                sum=sum+matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        System.out.println(diagonalSum(arr));
    }
}
