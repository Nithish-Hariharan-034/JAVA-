package looping_statement;
import java.util.*;
public class q70{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,a=0,d=0,p=0,ans=0,t;
           n=x.nextInt();
          for(int i=2;i<=n;i++)
          {
               a=i;
               t=i;
          while(a>9)
           {
              ans=0;
              while (t>0) {
                ans=ans+(t%10);
                t=t/10;
                }
                a=ans;
                t=ans;
            }
            System.out.print((ans==1)?i:"");
          }
           
     }
    
}
