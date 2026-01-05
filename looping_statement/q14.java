package looping_statement;
import java.util.*;
public class q14{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,ans=0,c;
           a=x.nextInt();
           c=a;
           while(a>0)
           {
            int t=1;
              r=a%10;
                 for(int i=1;i<=r;i++)
                 {
                    t=t*i;
                 }
                 ans=ans+t;
              a=a/10;
            }
            System.out.println((ans==c)?"Yes":"No");


     }
    
}
