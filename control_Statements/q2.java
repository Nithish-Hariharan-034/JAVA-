package control_Statements;
import java.util.Scanner;
public class q2 {
    
    public static void main(String[] args) {
        {
             int a,b;
             Scanner x=new Scanner(System.in);
             a=x.nextInt();
             b=x.nextInt();
             if(a<b)
             {
                System.out.print(a);
             }
             else{
                 System.out.print(b);
             }
        }
    }
}
