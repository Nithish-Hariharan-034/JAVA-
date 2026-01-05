package looping_statement;
import java.util.*;
public class q69{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,a=0,d=1,b=1,p=0;
           n=x.nextInt();
          for(int i=1;i<=n;i++)
          {
               if(i%10==7||i%7==0)
               {
                  System.out.print(i+" ");
               }
          }
          
           
     }
    
}
