package array;
import java.util.Scanner;
public class q9 {
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=0,ans=0;
              n=x.nextInt();
              int a[]=new int[n];
              for(int i=0;i<n;i++)
              {
                a[i]=x.nextInt();
              }
               for(int i=0;i<n;i++)
              {
                c++;
                   if(a[i]<0 && c!=1)
                   {
                       int t=a[i];
                       for(int j=i;j>0;j--)
                       {
                           a[j]=a[j-1];
                       }
                       a[0]=t;

                   }
              }
           /*  int f=n-1;
             for(int j=0;j<n;j++)
             {
                  if(a[j]>=0)
                  {
                     int t=a[j];
                     a[j]=a[f];
                     a[f]=t;
                     f--;
                  }
             }*/
              for(int i=0;i<n;i++)
              {
                System.out.print(a[i]+" ");
              }
        }
    }            
