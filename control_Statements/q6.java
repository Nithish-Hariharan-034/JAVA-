package control_Statements;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
      b=x.nextInt();
      c=x.nextInt();
      if(a>b && a>c)
        {
             System.out.println(a);
        } 
        else{
             if(b>c)
             {
                System.out.println(b);
             }
             else{
                System.out.print(c);
             }
        }
    }
    
}
