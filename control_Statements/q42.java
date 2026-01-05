
package control_Statements;
import java.util.Scanner;
public class q42 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    int z,b=10000,c,d;
    z=x.nextInt();
    switch(z)
    {
          case 1:
          c=x.nextInt();
          if(c<=b)  
          b=b-c;
          else
          System.out.print("Low Balance");
          System.out.print("Sucessfully debited\tbalance: "+b);
          break;

          case 2:
          d=x.nextInt();  
          b=b+d;
          System.out.print("Sucessfully Credited\tbalance: "+b);
          break;

          case 3: 
          System.out.print("balance: "+b);
          break;

          default:
    }
    
    

   }
}
    

