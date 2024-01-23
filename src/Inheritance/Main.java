package Inheritance;
import java.util.Scanner;
class shape{
    public void area(){
        System.out.println("Display area");
    }
}
class triangle extends shape{
   public void area(int l, int h){
       System.out.println(1/2*l*h);
    }
}
class equilateral extends shape{
   public void area(int r){
       System.out.println((3.14)*r*r);
   }
}
public class Main{
    public static void main(String[] args){
        triangle t1 = new triangle();
        t1.area(20,30);
        equilateral e1 = new equilateral();
        e1.area(20);
        shape s1 = new shape();
        s1.area();
    }
}