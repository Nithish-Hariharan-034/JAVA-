package array;
import java.util.Scanner;
public class q34 {

    public static void main(String args[])
    {
         int n,t,c=0,p=0;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         t=x.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=x.nextInt();
         }
         int m,l=0,h=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                 c++;
                 p=j;
                }
            }
            if(c>1){
            System.out.print(i+" "+p);
            return;}
        }
         
         
    }
    
}
