package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of subjects");
        int  size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter Subjects Marks");
        for(int i =0;i<size;i++) {
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found");
        int key = sc.nextInt();
        for(int i =0;i<size;i++) {
            if(key==marks[i]){
                System.out.println("Found it"+" "+i);
            }
        }
    }
}