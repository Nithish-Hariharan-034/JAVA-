package pattern;
import java.util.*;
public class q18{
            public static void main(String[] args) 
            {
                   int n;
                   Scanner x=new Scanner(System.in);
                   n=x.nextInt();
                    for(int i=0;i<n;i++)
                    {
                          for(int j=0;j<=i;j++)
                          {
                               System.out.print("* ");
                          }
                          for(int k=0;k<(n-1-i)*2;k++)
                          {
                                System.out.print("  ");
                          }
                          for(int j=0;j<=i;j++)
                          {
                               System.out.print("* ");
                          }
                          System.out.println();
                    } 

                    for(int i=0;i<n;i++)
                    {
                        for(int j=0;j<n-1-i;j++)
                        {
                             System.out.print("* ");
                        }
                        for(int k=0;k<(i+1)*2;k++)
                        {
                            System.out.print("  ");
                        }
                        for(int j=0;j<n-1-i;j++)
                        {
                             System.out.print("* ");
                        }
                        System.out.println();
                    }

            }
 
    
}
