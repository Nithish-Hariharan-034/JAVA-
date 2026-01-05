package looping_statement;
import java.util.*;
public class q40{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,a=0,d=0,p=0,cc=0,ans=0,c;
           n=x.nextInt();
        while(n>0)
           {
               a=n%10;
               if(cc==0)
               {
                 d=a;
               }
               n=n/10;
                if(n==0)
                { 
                    p=a;
                    a=d;
                }
               ans=(ans*10) +a;
               
               cc++;
            }
            
            if(cc>3)
            {
                int a1=0,w;
                  while(ans>0)
                  {
                      w=ans%10;
                      a1=(a1*10)+w;
                      ans=ans/10;
                  }
                  System.out.print(((a1/10)*10)+p);
                  return;
            }
           System.out.println(((ans/10)*10)+p);
           
     }
    
}
