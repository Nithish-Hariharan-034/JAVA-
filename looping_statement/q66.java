package looping_statement;
import java.util.*;
public class q66{
     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,a=0,d=0,p=0;
           n=x.nextInt();
          for(int i=1;i<=n;i++)
          {
                for(int j=1;j<=i/2;j++)
                {
                     if((j*j)==i)
                     {
                        System.out.println(i+" ");
                     }
                }
          }
           
     }
    
}
