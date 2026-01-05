package pattern;
import java.util.Scanner;
public class q24 {
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
                System.out.print(k+1);
              }
              for(int l=i;l>0;l--)
              {
                System.out.print(l);
              }
              System.out.println();
          }
    }
    
}
