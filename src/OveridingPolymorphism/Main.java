package OveridingPolymorphism;
class A{
    public int add(int n1,int n2) {
        return n1 + n2;
    }
}
class B extends A{
    @Override
    public int add(int n1, int n2) {
        return n1 +n2 +1;
    }
}
public class Main {
    public static void main(String[] args)
    {
        B b1 = new B();
        int r1 = b1.add(3,5);
        System.out.println(r1);
    }
}
