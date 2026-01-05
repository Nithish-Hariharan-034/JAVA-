package array;
import java.util.Scanner;
public class q38{

    public static void main(String args[])
    {
         int n,k,c=0,p=0,t=0;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         k=x.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=x.nextInt();
         }
         for(int i=0;i<n;i++)
            {
                int sum=0;
                for(int j=i;j<n;j++)
                {
                    sum=a[j]+sum;
                    if(sum==k)
                    {
                        p=i;
                        c=j;
                        t=1;
                        break;
                    }
                }
                if(t==1){break;}
            }
        System.out.print(p+" "+c);
                 
        }
         
         
    }
    

