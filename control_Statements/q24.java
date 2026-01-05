package control_Statements;
import java.util.Scanner;
public class q24 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    char y;
    int c;
    y= x.next().charAt(0);
    c=y;
    if(y>=48 && y<=59) 
    {
         System.out.print("Digit");
    }
    else{
           System.out.print("NOt a Digit");
        }
    }
    
 }
    

