package control_Statements;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
       if((a%10)%3==0)
       {
        System.out.println("yes");
       }
       else{
        System.out.println("No");
       }

    }
    
}
