package array;
import java.util.Scanner;
public class q6{
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=0;
              n=x.nextInt();
              int a[]=new int[n];
              for(int i=0;i<n;i++)
              {
                   a[i]=x.nextInt();
                   if(a[i]%2!=0)
                    c=c+a[i];
              }
              System.out.println(c);
        }
    }            
