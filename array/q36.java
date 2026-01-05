package array;
import java.util.Scanner;
public class q36 {

    public static void main(String args[])
    {
         int n,k,c=0,p=0;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         k=x.nextInt();
         k=n/k;
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=x.nextInt();
         }
         for(int i=0;i<k;i++){
             int t=a[0];
             for(int j=0;j<n-1;j++)
             {
                a[j]=a[j+1];
             }
             a[n-1]=t;
         }
         for(int i=0;i<n;i++)
         {
            System.out.print(a[i]+" ");
         }
                 
        }
         
         
    }
    

