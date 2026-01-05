package array;
import java.util.Scanner;
public class q8{
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=0;
              n=x.nextInt();
              int a[]=new int[n];
              int l=0,h=n-1,m=0;
              for(int j=0;j<n;j++)
              {
                a[j]=x.nextInt();
              }
              for(int i=0;i<n;i++)
              {
                  if(a[i]==0)
                  {
                      for(int j=i;j<n-1;j++)
                      {
                          a[j]=a[j+1];
                      }
                      a[n-1]=0;
                  }
              }
              for(int j=0;j<n;j++)
              {
                System.out.print(a[j]+" ");
              }
        }
    }            
