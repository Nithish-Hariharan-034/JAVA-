package control_Statements;
import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int y;
      char a;
      a=x.next().charAt(0);
      y=a;
       if((a%2==0) )
       {
        System.out.println("Even");
       }
       else{
        System.out.println("Odd");
       }

    }
    
}
