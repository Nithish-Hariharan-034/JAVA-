package looping_statement;
import java.util.*;
public class q1 {

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,a=1;
           n=x.nextInt();
           for(int i=0;i<n;i++)
           {
              a=(i+1)*a;
           }
           System.out.println(a);
     }
    
}
