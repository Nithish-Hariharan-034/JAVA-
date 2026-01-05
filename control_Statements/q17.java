package control_Statements;
import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
      b=x.nextInt();
       if(a%10==b%10 )
       {
        System.out.println("yes");
       }
       else{
        System.out.println("No");
       }

    }
    
}
