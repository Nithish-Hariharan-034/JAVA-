package array;
import java.util.Scanner;
public class q30 {

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
            for(int j=i;j<n-1;j++)
            {
                 if(a[i]==a[j])
                 {
                    
                    for(int k=j;k<n-1;k++)
                    {
                         a[k]=a[k+1];
                    }
                    n--;
                    
                 }
            }
         }
         for(int i=0;i<n;i++)
         {
             System.out.print(a[i]+" ");
         }
         
    }
    
}
