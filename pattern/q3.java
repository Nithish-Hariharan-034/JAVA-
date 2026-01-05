package pattern;
import java.util.*;
public class q3 {
      public static void main(String args[])
      {
          int n;
          Scanner x=new Scanner(System.in);
          n=x.nextInt();

          for(int i=0;i<n;i++)
          {
             for(int j=0;j<n;j++)
             {
                 if(j==0||i==0||j==n-1||i==n-1||i==j||i+j==n-1)
                 System.out.print("* ");
                else
                    System.out.print("  ");
             }
             System.out.println();
          }
      }
    
}
