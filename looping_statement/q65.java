package looping_statement;
import java.util.*;
public class q65{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,a=0,d=0,p=0;
           n=x.nextInt();
          for(int i=1;i<=n;i++)
          {
               int ans=0,r=0,c=i,b=1;
               while(c>0)
               {
                   b=1;
                   r=c%10;
                    for(int j=1;j<=r;j++)
                     {
                          b=b*j;
                     }
                     ans=ans+b;
                    c=c/10;
               }
              if(ans==i)
               {
                System.out.print(i+" ");
               }
          }
           
     }
    
}
