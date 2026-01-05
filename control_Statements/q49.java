package control_Statements;
import java.util.Scanner;
public class q49 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    double a,b=5000,c=2424,d;
    a=x.nextDouble();
    if(a==c) 
    {
        d=x.nextDouble();
         if(d<=b)
         {
            
            System.out.print("Sucessfully debited \t Balance: "+(b-d));
         }
         else{
            System.out.println("Insufficient Balace");
         }
    }
    else {
        System.out.print("Retry Again Wrong pin");
         }
    
    
 }
}
    

