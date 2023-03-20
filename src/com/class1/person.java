package com.class1;
import java.util.Scanner;

public class person {
   int id;
    String email;
    String name;
    public void display(){
        System.out.println(" id " + this.id);
        System.out.println(" email " + this.email);
        System.out.println(" name " + this.name);
    }
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter name: ");
        this.name = input.nextLine();

        System.out.print("Enter ID: ");
        this.id = input.nextInt();
    }
}
