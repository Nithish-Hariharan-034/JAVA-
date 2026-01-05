package array;
import java.util.Scanner;
public class q5 {
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=0,ans=0;
              n=x.nextInt();
              int a[]=new int[n];
              for(int i=0;i<n;i++)
              {
                   c++;
                   a[i]=x.nextInt();
                   if(c%2==0)
                   {
                     ans=ans-a[i];
                   }
                   else{
                    ans=ans+a[i];
                   }
              }
              System.out.println(ans);
        }
    }            
