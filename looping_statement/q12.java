package looping_statement;
import java.util.*;
public class q12{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,ans=0,b;
           a=x.nextInt();
         for(int i=1;i<=a/2;i++)
         {
              if(a%i==0)
              {
                 ans=ans+i;
              }
         }
         System.out.println(ans);

     }
    
}
