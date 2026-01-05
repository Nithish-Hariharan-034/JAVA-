package control_Statements;
import java.util.Scanner;
public class q31 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    int a,b,c,d;
    a=x.nextInt();
    b=x.nextInt();
    c=x.nextInt();
    d=x.nextInt();
    if(a==b &&b==c&&b==d)
    {
        System.out.print("Square");
    }
    else{
        if( (a==b&&d==c) || a==d && b==c){
        System.out.print("Rectangle");
        }
        else{
            System.out.println("Not both");
        }
    }
         
    
    
 }
}
    

