package looping_statement;
import java.util.*;
public class q72{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d=0,p=0;
           n=x.nextInt();
          for(int i=1;i<=n;i++)
          {
             for(int j=1;j<=n;j++)
             {
                  if((j*j)==i)
              System.out.print(j*j+" ");
             }
          }
           
     }
    
}
