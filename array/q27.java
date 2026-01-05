package array;
import java.util.Scanner;
public class q27{
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=0;
              n=x.nextInt();
              int k=x.nextInt();
              int a[]=new int[n];
              int l=0,h=n-1,m=0;
              for(int j=0;j<n;j++)
              {
                a[j]=x.nextInt();
              }
              for(int i=0;i<n;i++)
              {
                     for(int j=i+1;j<n;j++)
                     {
                         if(a[i]==a[j])
                         {
                            System.out.print(a[i]);
                            return;
                         }
                     }
              }

            }
        }   
