package control_Statements;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
     
        if(((a/100)%2)==0)
       {
        System.out.println("Even");
       }
       else{
        System.out.println("Odd");
       }

    }
 
}
