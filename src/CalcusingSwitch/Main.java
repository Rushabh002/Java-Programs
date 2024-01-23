package CalcusingSwitch;
import java.util.Scanner;
class operation {
    public int a;
    public int b;

    public int add(){
        return a+b;
    }
     public int sub(){
         return a-b;
    }
     public int mul(){
         return a*b;
    }
     public int divide(){
         return a/b;
    }
    operation(int a,int b){
        this.a = a;
        this.b = b;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Value");
        int a = sc.nextInt();
        System.out.println("Enter Second Value");
        int b =sc.nextInt();
        System.out.println("Enter the Operation");
        String opi = sc.next();
        operation op = new operation(a,b);
        switch (opi){
            case "+":
            {
                System.out.println(op.add());
                break;
            }
            case "-":
            {
                System.out.println(op.sub());
                break;
            }
            case "*":
            {
                System.out.println(op.mul());
                break;
            }
            case "/":
            {
                System.out.println(op.divide());
                break;
            }
            default:{
                System.out.println("Invalid");
            }
        }
    }
}