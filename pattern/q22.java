package pattern;
import java.util.*;
public class q22 {
    public static void main(String args[])
    {
         int n,y=0;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         for(int i=0;i<=n;i++)
         {
             for(int j=0;j<=i;j++)
             {
                System.out.print(++y +" ");
             }
             System.out.println();
         }
    }
    
}
