package pattern;
import java.util.*;
public class q9 {
      public static void main(String args[])
      {
          int n;
          Scanner x=new Scanner(System.in);
          n=x.nextInt();

          for(int i=0;i<n;i++)
          {
            for(int k=0;k<=i;k++)
             {
                System.out.print(" ");
             }
            for(int j=0;j<=n-i-1;j++)
             {
                System.out.print("* ");
             }
             System.out.println();
          }
      }
    
}
