package looping_statement;
import java.util.*;
public class q21{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,ans=0,b,t;
           a=x.nextInt();
           t=a;
           while(a%3==0)
           {
               a=a/3;
           }
           System.out.println((a==1)?"yes":"no");
    
}
}
