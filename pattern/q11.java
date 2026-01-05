package pattern;
import java.util.*;
public class q11{
      public static void main(String args[])
      {
          int n;
          Scanner x=new Scanner(System.in);
          n=x.nextInt();

          for(int i=0;i<n;i++)
          {
             for(int j=0;j<n-i-1;j++)
             {
                System.out.print(" ");
             }
             for(int k=0;k<=i;k++)
             {
                if(k==0||k==i||i==n-1)
                System.out.print("* ");
                else
                System.out.print("  ");
             }
             System.out.println();
          }
      }
    
}
