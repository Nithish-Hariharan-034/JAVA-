package array;
import java.util.Scanner;
public class q26{
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=1;
              n=x.nextInt();
              int a[]=new int[n];
              for(int j=0;j<n;j++)
              {
                a[j]=x.nextInt();
              }
              for(int i=0;i<n;i++)
              {
            
                if(a[i]!=c)
                {
                      System.out.print(c);
                      return;
                }
                c++;

              }   
            }}