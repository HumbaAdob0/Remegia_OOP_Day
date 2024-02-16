
package Main;

import java.util.Scanner;

public class Remegia1_2 {
    
    static Scanner str = new Scanner(System.in); 
    
    public static void main(String[] args){
        System.out.print("Enter your message:");
        
        String msg = str.nextLine();
        int con=0;
        
        String[] divMsg = msg.split("\\s+");
        
        int sizeOut= divMsg.length;

        for(int out=0; out<sizeOut; out++){

            String divMsg2 = divMsg[out];
            int sizeIn = divMsg2.length();
            //System.out.println(divMsg2);}
           for(int in=1; in<sizeIn; in++){
                int c = divMsg2.charAt(in);
                if(c<='Z'&&c>='A'){
                    System.out.print("JEJE");
                    con=2;
                    break;
                }
                else{
                    con=1;
                }
            }
           if(con==2){
           break;
           }
        }
        
        if(con==1){
            System.out.print("uWu");
        }
        
    }
    
}
    
