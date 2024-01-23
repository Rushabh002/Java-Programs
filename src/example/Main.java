package example;
import java.util.Scanner;
class company{
    private    int no;
    private int salary;
    private String companyname;
    public void companyInfo(){
        System.out.println("Company name: "+this.companyname);
        System.out.println("No of employess: "+this.no);
        System.out.println("Total Salary: "+this.salary);
    }

    company(String companyname,int no,int salary){
        this.companyname = companyname;
        this.no=no;
        this.salary=salary;

    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company Name: ");
        String name = sc.nextLine();
        System.out.println("Enter No of Employess: ");
        int no = sc.nextInt();
        System.out.println("Enter Total Salary: ");
        int salary = sc.nextInt();
        company c1 = new company(name,no,salary);
        c1.companyInfo();
        System.out.println("Enter First Value");
        int no1 = sc.nextInt();
        System.out.println("Enter Second Value");
        int no2 = sc.nextInt();
        System.out.println("Enter Operator");
        String value = sc.next();
        switch (value) {
            case "+":
                System.out.println("Addition is: " + (no1 + no2));
                break;
            case "-":
                System.out.println("Subtraction is: " + (no1 - no2));
                break;
            case "*":
                System.out.println("Multiplication is: " + (no1 * no2));
                break;
            case "/":
                System.out.println("Division is: "+(no1/no2));
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
