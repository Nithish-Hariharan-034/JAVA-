package array;
import java.util.Scanner;
/*public class q14{
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
              for(int i=0;i<n;i++)
              {
                  if(i<1)
                  {
                    m=(a[i]+a[i+1])-2*5;
                    
                  }
                  else{
                     if(i!=1)
                     m=(m+a[i])-2*5;
                  }
              }
              System.out.println(m);
             
    }            
}*/

public class q14{
    public static void main(String args[])
    {
       int n,c=0;
       Scanner x=new Scanner(System.in);
       n=x.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++)
       {
        a[i]=x.nextInt();
       }
       int e=n-1;
       for(int i=0;i<n;i++)
       {
           if(a[i]%2!=0)
           {
               int t=a[i];
               for(int j=i;j>0;j--)
               {
                  a[j]=a[j-1];
               }
               a[0]=t;
               c++;
            }
        }

        for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
} }