public class Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.move();
        Bear b=new Bear();
        b.diet();
    }
}

interface Herbivore{
    void diet();
}
interface Carnivore{
    void diet();
}

class Bear implements Herbivore, Carnivore{
    public void diet(){
        System.out.println("eats both grass and flesh");
    }
}
interface ChessPlayer{
    void move();
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("in all directions (Left,Right,Up,Down,Diagonally)");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("Left, Right, Up, Down");
    }
}

class Bishop implements ChessPlayer{
    public void move(){
        System.out.println("Diagonally in all directions");
    }
}

class King implements ChessPlayer{
    public void move(){
        System.out.println("Moves one step in any direction");
    }
}

class Horse1 implements ChessPlayer{
    public void move(){
        System.out.println("");
    }
}