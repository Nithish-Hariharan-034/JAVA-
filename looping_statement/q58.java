package looping_statement;
import java.util.*;
public class q58{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d=0,p=0;
           n=x.nextInt();
          for(int i=0;i<n;i++)
          {
              if((i+1)%2==0)
              {
                a=a+(i+1);continue;
              }
              p=p+(i+1);
                
          }
          System.out.println(a+"  "+p);
           
     }
    
}
