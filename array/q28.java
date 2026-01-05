package array;
import java.util.Scanner;
public class q28 {

    public static void main(String args[])
    {
         int n;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=x.nextInt();
         }
         for(int i=0;i<n;i++)
         {
            int c=0;
            for(int j=0;j<n;j++)
            {
                 if(a[i]==a[j] && i!=j)
                 {
                    c++;
                 }
            }
            if(c==0){System.out.print(a[i]);return;}
         }
         System.out.println(-1);
    }
    
}
