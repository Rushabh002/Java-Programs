package Strings;

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstname= sc.next();
        String Lastname=sc.next();
        if(firstname.compareTo(Lastname)==0){
            System.out.println("Strings are Equal ");
        }
        else{
            System.out.println("Not Equal ");
        }
    }
}