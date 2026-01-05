package control_Statements;
import java.util.Scanner;
public class q28{
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    int a,b,c;
    a=x.nextInt();
    b=x.nextInt();
     if(a>0 && b>0)
     {
        System.out.print("I Q");
     }
     else{
           if(a<0 && b>0)
           {
              System.out.println("II Q");
           }
           else{
               if(a<0 && b<0)
               {
                System.out.println("IIIQ");
               }
               else{
                System.out.print("IVQ");
               }
           }
     }
         
    
    
 }
}
    

