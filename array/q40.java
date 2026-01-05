package array;
import java.util.Scanner;
public class q40{

    public static void main(String args[])
    {
         int n,k,c=0,p=0,t=0,m=Integer.MIN_VALUE;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         k=x.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=x.nextInt();
         }
        int cs=a[0];
        int ms=a[0];
          for(int i=1;i<n;i++)
          {
                if(a[i]>(cs+a[i]))
                {
                    cs=a[i];
                }else{
                    cs+=a[i];
                }
                if(cs>ms)
                {
                    ms=cs;
                }
          }
          System.out.println(ms);
        }
    }
    

