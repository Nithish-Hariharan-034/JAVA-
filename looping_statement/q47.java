package looping_statement;
import java.util.*;
public class q47{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d,p=0;
           n=x.nextInt();
           while(n>0)
           {
              a=n%10;
              c=(a*a*a)+c;
              p=(a*a)+p;
              n=n/10;
           }
           System.out.println("Sum of square"+p+"\t\tSum of cube:"+c);
           
     }
    
}
