package looping_statement;
import java.util.*;
public class q9 {

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,t1,t2,b;
           a=x.nextInt();
            b=x.nextInt();
            t1=a;
            t2=b;
           while(b>0)
           {
              r=b;
              b=a%b;
              a=r;
            }
            System.out.println((t1*t2)/a);

     }
    
}
