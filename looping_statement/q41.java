package looping_statement;
import java.util.*;
public class q41{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d,p=0,s=0;
            n=x.nextInt();
          /*  d=n;
           while(n>0)
           {
                int y=d;
                p=0;
                a=n%10;
                 while(y>0)
                 {
                   if(y%10==a)
                   {
                    p++;
                   }
                   y=y/10;
                 }
                 if(p!=0)
                 System.out.println(a+" "+p+" times");
                n=n/10;
            }*/
           int [] f=new int[10];
           while(n>0)
           {
               a=n%10;
               f[a]++;
               n=n/10;
          }

          for(int i=0;i<=9;i++)
          {
              if(f[i]>0)
              {
                System.out.print(i+" : "+f[i]+" ");
              }
          }

           
     }
    
}
