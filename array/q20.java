package array;
import java.util.Scanner;
public class q20{
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
             m=Integer.MIN_VALUE;
             int s=Integer.MIN_VALUE;
              for(int i=0;i<n;i++)
              {
                       if(a[i]>m)
                       {
                           s=m;
                           m=a[i];
                       }
                       else if(a[i]>s && a[i]!=m)
                       {
                          s=a[i];
                       }
              }
                  System.out.println(s);                      
              }
              
        }   
