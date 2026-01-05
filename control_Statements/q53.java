package control_Statements;
import java.util.Scanner;
public class q53 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    double a,b,c;
    a=x.nextDouble();
    if(a<18) 
    {
        System.out.print("Cold");
    }
    else if(a>18 && a<24){
        System.out.print("Pleasnt");}
        else if(a>24 && a<35)
        {
        System.out.print("Hot");
        }
        else if (a>35) {
            System.out.println("Heatwave");
            
        }
         
    
    
 }
}
    

