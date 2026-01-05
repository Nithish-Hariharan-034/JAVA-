package control_Statements;
import java .util.Scanner;
public class q1 {
     public static void main(String args[])
     {
         int a,b;
         Scanner x=new Scanner(System.in);
         a=x.nextInt();
         b=x.nextInt();
         if(a>b)
         {
            System.out.println(a);
         }
         else{
             System.out.println(b);
         }
     }   
}
