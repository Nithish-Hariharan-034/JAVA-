package array;
import java.util.Scanner;
public class q32 {

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
         for(int i=1;i<n;i++)
         {
              if(a[i]==a[i-1])
              {
                for(int j=i;j<n-1;j++)
                {
                    a[j]=a[j+1];
                }
                n--;
              }
         }
          for(int i=0;i<n;i++)
         {
             System.out.print(a[i]+" ");
         }
         
         
    }
    
}
