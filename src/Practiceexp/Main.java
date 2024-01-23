package Practiceexp;

import java.util.Scanner;

class student{
    private String name ;
    private int age;
    private int rollno;
    public void show() {
        System.out.println("Name is " + name);
        System.out.println("Age is "+ age);
        System.out.println("Roll no is "+rollno);
    }
student(String name , int age,int rollno ){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        String name = sc.nextLine();
        int age = sc.nextInt();
        int rollno = sc.nextInt();
        student s1= new student(name,age,rollno);
        s1.show();



    }
}
