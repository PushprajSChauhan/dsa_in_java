public class ShortestPath {
    public static float getShortestPath(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
//            FOR S
            if(s.charAt(i)=='S'){
                y--;
            }
            else if(s.charAt(i)=='N'){
                y++;
            }
            else if(s.charAt(i)=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
