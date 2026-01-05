package looping_statement;
import java.util.*;
public class q8 {

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,ans=0,b;
           a=x.nextInt();
            b=x.nextInt();
           while(b>0)
           {
              r=b;
              b=a%b;
              a=r;
            }
            System.out.println(a);

     }
    
}
