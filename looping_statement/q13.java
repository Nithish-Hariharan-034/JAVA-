package looping_statement;
import java.util.*;
public class q13{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,ans=0,b;
           a=x.nextInt();
         for(int i=1;i<=a/2;i++)
         {
              if(a==i*i)
              {
                    ans++;
              }
         }
         System.out.println((ans==1)?"yes":"no");

     }
    
}
