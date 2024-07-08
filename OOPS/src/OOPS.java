public class OOPS {
    public static void main(String[] args) {
        Pen p1=new Pen(); //CREATED A PEN OBJECT P1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        BankAccount acc=new BankAccount();
        acc.username="new name";
//        acc.password="12345";
//        THIS LINE WILL GIVE ERROR AS THE PASSWORD FIELD WILL NOT BE VISIBLE IN MAIN CLASS BEING A PRIVATE MEMBER
        acc.setPassword("12345");
        Student s1=new Student("chintu");
        System.out.println(s1.name);
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
//        SHALLOW COPY KRENGE TOH INDEX 1 PE MARKS 85 HO JAATE COPY HONE KE BAAD BHI
        s1.marks[1]=85;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }

    int getTip(){
        return this.tip;
    }

    String getColor(){
        return this.color;
    }
}

class Student{
    String name;
    int age;
    float percent;
    int marks[];
    Student(String name){
//      THIS IS PARAMETERISED CONSTRUCTOR
        marks=new int[3];
        System.out.println("Constructor called");
        this.name=name;
    }
    Student(){
        marks=new int[3];
//        THIS IS NON-PARAMETERISED CONSTRUCTOR
    }

//    Student(Student s){
//        THIS IS A COPY CONSTRUCTOR WHERE SHALLOW COPYING IS USED
//        marks=new int[3];
//        this.name=s.name;
//        this.age=s.age;
//        this.percent=s.percent;
//        this.marks=s.marks;
//        THE ABOVE LINE USES SHALLOW COPY
//    }
    Student(Student S){
//        THIS IS ALSO A COPY CONSTRUCTOR WHERE DEEP COPYING IS USED
        marks=new int[3];
        this.percent=S.percent;
        this.age=S.age;
        this.name=S.name;
//        TO DEEP COPY THE MARKS IN SEPARATE ARRAY WE WILL USE LOOP
        for(int i=0;i<marks.length;i++){
            this.marks[i]=S.marks[i];
        }
    }
    void calcPercent(int P, int C, int M){
        percent=(P+C+M)/3;
    }
}