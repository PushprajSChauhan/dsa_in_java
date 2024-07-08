public class StaticKeyword {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.school="ABCD";
        Student1 s2=new Student1();
        System.out.println(s2.school);
        Student1 s3=new Student1();
        s3.school="EFGH";
    }
}

class Student1{
    static int percentage(int P, int C, int M){
        return (P+C+M)/3;
    }
    String name;
    int roll;
    static String school;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
}