package control_Statements;
import java.util.Scanner;
public class q48 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    double a,b,c;
    a=x.nextDouble();
    if(a<=100) 
    {
        System.out.print("Free \t Bill: "+"0");
    }
else if(a<=300){
        System.out.print("Bill: "+a*5+"rs");
}
else if(a>500)
{
       System.out.print("You are fined with 500rs For exceeding \t Bill: "+(a*20)+"Fine:500Rs"+"TotalBill: "+((a*20)+500));
}
    
    
 }
}
    

