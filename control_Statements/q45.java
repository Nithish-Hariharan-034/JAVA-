package control_Statements;
import java.util.Scanner;
public class q45 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    double a,b,c;
    a=x.nextDouble();
    if(a==100) 
    {
        System.out.print("Battery Full "+a+" %");
    }
else if(a<50 && a>20){
        System.out.print("50% Consumed "+a+" %");
}
else if(a<=20)
{
     System.out.println("Low Battery"+a+" %");
}
else
{
    System.out.println("Battery :"+a+" %");
}
    
    
 }
}
    

