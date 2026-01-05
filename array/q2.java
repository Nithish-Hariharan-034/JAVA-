package array;
import java.util.Scanner;
public class q2 {
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=0;
              n=x.nextInt();
              int a[]=new int[n];
              for(int i=0;i<n;i++)
              {
                   a[i]=x.nextInt();
                   c=c+a[i];
              }
              System.out.println(c);
        }
    }            
