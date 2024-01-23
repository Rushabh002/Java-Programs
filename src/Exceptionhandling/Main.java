package Exceptionhandling;
public class Main {
    public static void main(String[] args){
        int i =0;
        int j = 0;
        int[] arr = new int[6];
        String name = null;
        try{
            j = 18/i;
            if(j==0){
                throw new ArithmeticException();
            }
            System.out.println(arr[1]);
            System.out.println(arr[5]);
            System.out.println(name.length());
        }
        catch (ArithmeticException e){
            j = 18/1;
            System.out.println("Cannot divide");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are Exceeding array limit");
        }
        catch(Exception e ){
            System.out.println("Invalid");
        }
        System.out.println(j);
        System.out.println("Bye");

    }
}
