package control_Statements;
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
      b=x.nextInt();
       if(((a+b)%2)==0)
       {
        System.out.println("Even");
       }
       else{
        System.out.println("Odd");
       }

    }
    
}
