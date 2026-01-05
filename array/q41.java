package array;
import java.util.Scanner;
public class q38{

    public static void main(String args[])
    {
         int n,k,c=0,p=0;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         k=x.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=x.nextInt();
         }
         int maxs=a[0],mins=a[0],r;
         for(int i=0;i<n;i++)
            {

                if(a[i]<0)
                {
                    int t=maxs;
                    maxs=mins;
                    mins=t;
                }
            }
        System.out.print(p+" "+c);
                 
        }
         
         
    }
    

