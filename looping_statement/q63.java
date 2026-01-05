package looping_statement;
import java.util.*;
public class q63{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d=0,p=0;
           n=x.nextInt();
          for(int i=1;i<=n;i++)
          {
             c=0;
              for(int j=2;j<=i/2;j++)
              {
                   if(i%j==0)
                   {
                     c++;
                   }
              }
              System.out.print((c==0)?i:"");
          }
           
     }
    
}
