package array;
import java.util.*;
public class q25 {
      
       public static void main(String args[])
       {
              int n;
              Scanner x=new Scanner(System.in);
              n=x.nextInt();
              int[] a =new int[n];
              for(int i=0;i<n;i++)
              {
                  a[i]=x.nextInt();
              }
              int l=0,m=0,h=n-1;
              while(m<=h)
              {
                   if(a[m]==1)
                   {
                     m++;
                   }else if(a[m]==0)
                   {
                        int t=a[m];
                        a[m]=a[l];
                        a[l]=t;
                        l++;
                        m++;
                   }else{
                        int t=a[m];
                        a[m]=a[h];
                        a[h]=t;
                        h--;
                        m++;
                   }
               }

               for(int i=0;i<n;i++)
               {
                System.out.print(a[i]+" ");
               }
       }
    
}
