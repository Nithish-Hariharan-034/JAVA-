package looping_statement;
import java.util.*;
public class q20{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,ans=0,b,t;
           a=x.nextInt();
           t=a;
           while(a>0 &&a!=1)
           {
              ans=0;
              while (t>0) {
                ans=ans+(t%10);
                t=t/10;
                }
                a=ans;
                t=ans;
           }
           System.out.println((ans==1)?"yes":"no");
    
}
}
