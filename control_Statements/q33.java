package control_Statements;
import java.util.Scanner;
public class q33 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    int a,b,c,d;
    a=x.nextInt();
    if((a%4==0&&a%100!=0)||(a%400==0))
    {
        System.out.print("Leap Year");
    }
    else{
        System.out.print("Not a leap Year");
    }
         
    
    
 }
}
    

