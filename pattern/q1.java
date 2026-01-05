package pattern;
import java.util.*;
public class q1 {
      public static void main(String args[])
      {
          int n;
          Scanner x=new Scanner(System.in);
          n=x.nextInt();

          for(int i=0;i<n;i++)
          {
             for(int j=0;j<n;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
          }
      }
    
}
