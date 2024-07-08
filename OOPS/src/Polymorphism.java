public class Polymorphism {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.sum(10,5));
        System.out.println(c.sum(20.3f,303.9f));
        System.out.println(c.sum(2,3,5));
        Deer d=new Deer();
        d.eats();
        Animal1 a=new Animal1();
        a.eats();
        Animal1 a1=new Deer();
        a1.eats();
//        Deer d1=new Animal1();
//        d1.eats();
//        ERROR AYEGI BCOS CHILD KA REFERENCE PARENT KO POINT NHI KRSKTA
    }
}

class Animal1{
//    DYNAMIC POLYMORPHISM
    void eats(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal1{
    @Override
    void eats() {
        System.out.println("eats grass");
    }
}
class Calculator{
//    STATIC POLYMORPHISM
    int sum(int a,int b){
        return a+b;
    }
    float sum(float c, float d){
        return c+d;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
