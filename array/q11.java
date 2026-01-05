package array;
import java.util.Scanner;
public class q11 {
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
              for(int i=0;i<n/2;i++)
              {
                   int t=a[n-1-i];
                   a[n-1-i]=a[i];
                   a[i]=t;
              }
              for(int i=0;i<n;i++){
              System.out.print(a[i]+" ");}
        }
    }            
