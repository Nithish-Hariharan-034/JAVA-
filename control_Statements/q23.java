package control_Statements;
import java.util.Scanner;
public class q23 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    char y;
    int c;
    y= x.next().charAt(0);
    c=y;
    if(y>=65 && y<=90 || y>=95 && y<=122) 
    {
         System.out.print("Alphabet");
    }
    else{
           System.out.print("NOt a Alphbet");
        }
    }
    
 }
    

