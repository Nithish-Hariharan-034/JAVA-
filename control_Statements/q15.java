package control_Statements;
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
       if(a%3==0)
       {
        System.out.print("Divisible by 3");
       }
       else{
           if(a%7==0)
           {
            System.out.print("Divisible by 7");
           }
           else
           {
             System.out.println("Not by both");
           }
       }

    }
    
}
