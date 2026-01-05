package control_Statements;
import java.util.Scanner;
public class q26 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    int a,b,c;
    a=x.nextInt();
    b=x.nextInt();
    c=x.nextInt();
    if(a==b&&b==c)
    {
        System.out.print("Equalateral");
    }
    else{
          if(a==b || b==c || c==a)
          {
              System.out.print("Isosales");
          }
          else{
            System.out.print("Scalene");
          }
    }
         
    
    
 }
}
    

