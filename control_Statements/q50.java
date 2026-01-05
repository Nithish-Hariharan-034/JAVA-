package control_Statements;
import java.util.Scanner;
public class q50 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    double a,b=5000,c=2424,d;
    a=x.nextDouble();
    if(a==c) 
    {
        d=x.nextDouble();
         if(d<=b && d%100==0)
         {
            
            System.out.println("Sucessfully debited \t Balance: "+(b-d));
            System.out.println("500: "+d/500);
            System.out.println("200:"+d%500/200);
            System.out.println("100: "+d%500%200/100);
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
    

