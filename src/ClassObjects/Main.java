package ClassObjects;

class Pen {
    String color;
    int no;
    String type;
    public void write() {
        System.out.println("Writing Something");
    }
    public void color() {
        System.out.println(this.color);
    }
    public void type() {
        System.out.println(this.type);
    }

    public void no() {
        System.out.println(this.no);
    }
}
class student{
    String name;
    int age;
    public void studInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(String name,int age){
        this.name= name;
        this.age=age;
    }
}
public class Main {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color ="Black";
        pen1.type = "Gel Pen";
        pen1.color();
        student s1 = new student("Rushabh",23);
        s1.studInfo();
    }
}