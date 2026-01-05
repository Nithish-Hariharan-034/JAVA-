package array;
import java.util.Scanner;
public class q29 {

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
            for(int j=i+1;j<n;j++)
            {
                 if(a[i]==a[j])
                 {
                    System.out.print(a[i]+" ");
                    
                 }
            }
         }
         
    }
    
}
