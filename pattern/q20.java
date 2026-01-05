package pattern;
import java.util.Scanner;
public class q20{
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
                if(i==0||k==(((n-i)*2)-1)-1)
                System.out.print("*");
                else
                System.out.print(" ");    
              }
              System.out.println();
          }
          for(int i=1;i<n;i++)
          {
              for(int j=0;j<n-i-1;j++)
              {
                System.out.print(" ");
              }
              for(int k=0;k<(i*2)+1;k++)
              {
                if(k==0||k==((i*2)+1)-1)
                System.out.print("*");
                else
                System.out.print(" ");
              }
              System.out.println();
          }
           
    }
    
}
