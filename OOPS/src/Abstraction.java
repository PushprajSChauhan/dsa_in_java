public class Abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color);
        Chicken c=new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal2{
    String color;
    Animal2(){
        color="brown";
        System.out.println("animal2 constructor called");
    }

    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}

class Horse extends Animal2{
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color="white";
    }

    void walk(){
        System.out.println("horse walks");
    }
}

class Chicken extends Animal2{
    void changeColor(){
        color="peach";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}