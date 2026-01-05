package control_Statements;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a;
      a=x.nextInt();
       if((a&1)==0)
       {
        System.out.println("Even");
       }
       else{
        System.out.println("Odd");
       }

    }
    
}
