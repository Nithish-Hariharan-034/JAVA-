package control_Statements;
import java.util.Scanner;
public class q3 {
     
     public static void main(String args[])
     {
         int a;
         Scanner x=new Scanner(System.in);
        a=x.nextInt();
        if((a&1)==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
     }
    
}
