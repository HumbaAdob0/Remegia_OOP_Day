package Main;
import java.util.Scanner;
public class MainMethod {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
    Student st1 = new Student();
    Student st2 = new Student();
    
    st1.Student("Jemar Jude", "Maranga", 17, true);
    st2.Student("Jose", "Cruz", 19, false);
    
    int ctr;
    do{
    System.out.print("Enter test case number: ");
    ctr = in.nextInt();
    }while(ctr>3);
    
    
    if(ctr==1){
        System.out.println("Test Case 1: Student under 18");
        System.out.println(st1.toString());
    }
    else if(ctr==2){
        System.out.println("Test Case 2: Increase age of student21");
        st1.increaseAge();
        System.out.println(st1.toString());
    }
    else if(ctr==3){
        System.out.println("Test Case 3: Student over 18");
        st2.increaseAge();
        System.out.println(st2.toString());
    }  
    }
    
    //System.out.println(st1.getName());
    
}
