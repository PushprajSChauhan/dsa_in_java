public class SuperKeyword {
    public static void main(String[] args) {
        Horse2 h=new Horse2();
        System.out.println(h.color);
    }
}

class Animal3{
    String color;
    Animal3(){
        System.out.println("animal constructor called");
    }
}

class Horse2 extends Animal3{
    Horse2(){
//        super();  YEH LIKHNE SE ANIMAL3 CLASS KA CONSTRUCTOR CALL HO JAYEGA JO ABHI BHI HORHA H APNE AAP
        super.color="brown";
        System.out.println("horse constructor called");
    }

}