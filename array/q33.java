package array;
import java.util.Scanner;
public class q33 {

    public static void main(String args[])
    {
         int n,t;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         t=x.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=x.nextInt();
         }
         int m,l=0,h=n-1;
         while(l<=h)
         {
            m=(l+(h-l))/2;
            if(a[m]==t)
            {
                System.out.println(a[m]);
                return;
            }
            else if(a[m]<t){
                l=m+1;
             }else{
                h=m-1;
             }
         }
        System.out.println(-1);
         
         
    }
    
}
