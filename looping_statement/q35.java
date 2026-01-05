package looping_statement;
import java.util.*;
public class q35 {

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0;
           n=x.nextInt();
           while(n>0)
           {
                a=n%10;
                n=n/10;

           }
           System.out.println((a%2==0)?"Even":"Odd");
           
     }
    
}
