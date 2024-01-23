package MarksheetProject;
import MarksheetProject.marksheet;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fullname: ");
        String name = sc.nextLine();
        System.out.println("Enter Fathername: ");
        String fathername = sc.nextLine();
        System.out.println("Enter Enrollment:");
        long enrollment = sc.nextLong();
        System.out.println("Enter no of Subjects: ");
        int n = sc.nextInt();
        int total = 0;
        int[] marks = new int[n];
        for(int i =0;i<n;i++){
            marks[i]=sc.nextInt();
            total = total+marks[i];
        }
        int per = total/n;
        marksheet m1 = new marksheet(name,fathername,enrollment,n,total,per);
        m1.studinfo();

    }
}