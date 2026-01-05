package control_Statements;
import java.util.Scanner;
public class q59 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    double a,b=500,c=2424,d;
    a=x.nextDouble();
    if(a==b/2) 
    {
        System.out.println("Halfconsumed");
    }
    else{
          if((a-b)==0)
              {
                System.out.println("Data Over");
              }
              else{
                 if(b<a/2)
                 {
                    System.out.println("Low Data");
                 }
                 else{
                    System.out.println("Data Available");
                 }
              }

    }
    
 }
}
    

