public class Inheritance {
    public static void main(String[] args) {
        Fish f=new Fish();
        f.color="grey";
        f.fins=6;
        f.eat();
        f.breath();
        f.swim();
        Dog d=new Dog();
        d.eat();
        d.legs=4;
        System.out.println(d.legs);
    }
}
class Animal{
//    BASE CLASS
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
//    DERIVED CLASS
//    HIERARCHIAL INHERITANCE AND SINGLE LEVEL INHERITANCE
        int fins;
        void swim(){
            System.out.println("swims");
        }
}

class Mammal extends Animal{
//    MULTI-LEVEL INHERITANCE AND HIERARCHIAL INHERITANCE
    int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Mammal{
//    HIERARCHIAL INHERITANCE
    void fly(){
        System.out.println("fly");
    }
}
class Dog extends Mammal{
//    MULTI-LEVEL INHERITANCE
    String breed;
}