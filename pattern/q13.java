package pattern;
import java.util.Scanner;
public class q13 {
    public static void main(String args[])
    {
          int n;
          Scanner x=new Scanner(System.in);
          n=x.nextInt();
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<i;j++)
              {
                System.out.print(" ");
              }
              for(int k=0;k<((n-i)*2)-1;k++)
              {
                System.out.print("*");
              }
              System.out.println();
          }
    }
    
}
