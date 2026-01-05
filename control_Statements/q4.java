package control_Statements;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
      int a,b;
      a=x.nextInt();
      b=x.nextInt();
      if((a-b)%2==0)
        {
            System.out.print("even");
        }  
        else{
             System.out.print("odd");
        }
    }
    
}
