package control_Statements;
import java.util.Scanner;
public class q52 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    double a,b,c;
    a=x.nextDouble();
    if(a>=10000) 
    {
         b=a*(50.0/100);
        System.out.print(a-b);
    }
    else if(a>=5000){
         b=a*(25.0/100);
        System.out.print(a-b);}
        else
        {
            
         b=a*(5.0/100);
        System.out.print(a-b);
        }
         
    
    
 }
}
    

