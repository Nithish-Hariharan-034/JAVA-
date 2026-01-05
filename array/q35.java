package array;
import java.util.Scanner;
public class q35 {

    public static void main(String args[])
    {
         int n,m,c=0,p=0;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         m=x.nextInt();
         int a[]=new int[n];
         int b[]=new int[m];
         for(int i=0;i<n;i++)
         {
             a[i]=x.nextInt();
         }
         for(int i=0;i<m;i++)
         {
             b[i]=x.nextInt();
         }
         int t=n+m;
         int z[]=new int[t];
        for(int i=0;i<t;i++)
         {
             if(i<n)
             z[i]=a[i];
             else
             z[i]=b[c++];   
         }
         for(int i=0;i<t;i++)
         {
            for(int j=i;j<t;j++)
            {
                if(z[i]>z[j]){
                int te=z[j];
                z[j]=z[i];
                z[i]=te;}

            }
         }
         for(int i=0;i<t;i++)
         {
            System.out.print(z[i]+" ");
         }
         
         
    }
    
}
