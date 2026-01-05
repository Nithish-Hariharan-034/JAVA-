package control_Statements;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
       if(a%3==0 && a%5==0)
       {
        System.out.println("yes");
       }
       else{
        System.out.println("No");
       }

    }
    
}
