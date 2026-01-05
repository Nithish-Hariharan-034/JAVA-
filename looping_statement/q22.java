package looping_statement;
import java.util.*;
public class q22{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,b,t,ans;
           a=x.nextInt();
           b=x.nextInt();
           ans=a;
           for(int i=2;i<=b;i++)
           {
             ans=a+ans;
           }
           System.out.println(ans);
    
}
}
