public class FloodFillAlgorithm {

    public static void helper(int [][] image, int startRow, int startCol, int color, boolean vis[][], int origColor){
        if(startRow<0 || startCol<0 || startRow>=image.length || startCol>=image[0].length || vis[startRow][startCol] || image[startRow][startCol]!=origColor){
            return;
        }

        vis[startRow][startCol]=true;
        image[startRow][startCol]=color;
//        left
        helper(image,startRow,startCol-1,color,vis,origColor);
//        right
        helper(image,startRow,startCol+1,color,vis,origColor);
//        up
        helper(image,startRow-1,startCol,color,vis,origColor);
//        down
        helper(image,startRow+1,startCol,color,vis,origColor);
    }
    public static int[][] floodFill(int [][] image, int sr, int sc, int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        int [][] grid={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1,sc=1,color=2;
        int [][] ans=floodFill(grid,sr,sc,color);

        for(int i[]:ans){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
