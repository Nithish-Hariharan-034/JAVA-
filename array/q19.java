package array;
import java.util.Scanner;
public class q19{
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
             m=a[0];
              for(int i=1;i<n;i++)
              {
                       if(a[i]<m)
                       {
                           m=a[i];
                       }
                       
              }
              System.out.println(m);
        }
    }            
