package looping_statement;
import java.util.*;
public class q46{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d=0,p=0;
           n=x.nextInt();
           while(n>0)
           {
              a=n%10;
              if(a!=0)
              {
                 p=(p*10)+a;
              }
              n=n/10;
           }
           while(p>0)
           {
              c=p%10;
              d=(d*10)+c;
              p=p/10;

           }
           System.out.println(d);
           
     }
    
}
