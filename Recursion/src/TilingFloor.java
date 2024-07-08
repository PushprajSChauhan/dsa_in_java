public class TilingFloor {
    public static int tilesOnFloor(int n){ //FLOOR SIZE 2 x n
//        BASE CASE
        if(n==0 || n==1){
            return 1;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI AND CALL TO FUNCTION FOR SMALLER VALUES
//        IF WE PLACE TILES VERTICALLY
        int verTiles=tilesOnFloor(n-1);
//        IF WE PLACE TILES HORIZONTALLY
        int horTiles=tilesOnFloor(n-2);
        return verTiles+horTiles;

//        OR SIMPLY WE CAN WRITE
//        return tilesOnFloor(n-1)+tilesOnFloor(n-2);
    }

    public static void main(String[] args) {
        System.out.println(tilesOnFloor(4));
    }
}
