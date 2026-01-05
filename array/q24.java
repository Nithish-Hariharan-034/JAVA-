package array;
import java.util.*;
public class q24 {
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=0;
              n=x.nextInt();
              int a[]=new int[n];
              for(int i=0;i<n;i++)
              {
                   a[i]=x.nextInt();
              }
              for(int i=0;i<n-1;i++)
              {
                for(int j=0;j<n-1-i;j++)
                {
                      if(a[j+1]<a[j])
                      {
                         int t=a[j+1];
                         a[j+1]=a[j];
                         a[j]=t;
                      }
                }
              }
                 for(int i=0;i<n;i++)
              {
                 System.out.print(a[i]+" ");
              }         
              
         }   
}
