package control_Statements;
import java.util.Scanner;
public class q51 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    String a;
    a=x.nextLine();
    if(a.equals("Red" )||a.equals("red"))
        {
            System.out.println("Stop");
        } 
     else if(a.equals("Green" )||a.equals("green")) 
        {
            System.out.print("Go");
        }  
        else
        {
             System.out.println("Wait");
        }
} }
    

