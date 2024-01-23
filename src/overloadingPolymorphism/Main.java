package overloadingPolymorphism;
class student{
    String name;
    int age;
    public void studInfo(String name){
        System.out.println(name);
    }
    public void studInfo(int age){
        System.out.println(age);
    }
    public void studInfo(String name,int no){
        System.out.println(name+" "+no);
    }
}
public class Main{
    public static void main(String[] args){
        student s1 = new student();
        s1.name ="Rushabh";
        s1.age=23;
        s1.studInfo(s1.age);

    }
}