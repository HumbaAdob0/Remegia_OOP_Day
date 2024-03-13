package Main;

import java.util.Scanner;

public class main {
    
    static Scanner str = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.print("Enter full name(Last name, First name): ");
            String name = str.nextLine();
        
            System.out.print("Enter age : ");
            int age = num.nextInt();
        
            System.out.print("Enter gender(Male/Female) : ");
            String gen = str.nextLine();
        
            System.out.print("Enter address : ");
            String addr = str.nextLine();
        
            System.out.print("Enter civil status : ");
            String cs = str.nextLine();
        
            System.out.print("Enter no. siblings : ");
             int nsib = num.nextInt();
             
             System.err.println("\n\nFull name : "+name);
             System.err.println("Age : "+age);
             System.err.println("Gender : "+gen);
             System.err.println("Address : "+addr);
             System.err.println("Civil status : "+cs);
             System.err.println("Number of siblings : "+nsib);
             
    
    }
}
