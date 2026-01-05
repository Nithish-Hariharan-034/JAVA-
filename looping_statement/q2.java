package looping_statement;
import java.util.*;
public class q2 {

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,ans=0;
           a=x.nextInt();
           while(a>0)
           {
              r=a%10;
              ans=ans+r;
              a=a/10;
            }
            System.out.println(ans);

     }
    
}
