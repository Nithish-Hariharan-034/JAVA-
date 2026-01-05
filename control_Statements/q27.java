package control_Statements;
import java.util.Scanner;
public class q27 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    int a,b,c;
    a=x.nextInt();
    b=x.nextInt();
    c=x.nextInt();
    if((a+b+c==180)&&( (a==90) ||(b==90)||(c==90) )  )
    {
        System.out.print("right Angled triangle");
    }
    else{
        System.out.print("Not");
    }
        
    
 }
}
    

