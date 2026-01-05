package looping_statement;
import java.util.*;
public class q71{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d=0,p=0;
           n=x.nextInt();
          for(int i=1;i<=n;i++)
          {
                if((i&(i-1))==0)
              System.out.print(i+" ");
          }
           
     }
    
}
