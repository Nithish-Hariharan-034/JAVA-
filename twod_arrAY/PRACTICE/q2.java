package twod_arrAY;


import java.util.Scanner;
public class q2 {
    public static void main(String args[])
    {
         int n,t,c;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         t=x.nextInt();
         int a[][]=new int[n][t];
         int b[]=new int[n];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++)
             a[i][j]=x.nextInt();
         }
         int m=a[0][0];
         for(int i=0;i<n;i++)
         {
             c=Integer.MIN_VALUE;
             for(int j=0;j<t;j++)
             {
                 if(b[i]<a[i][j])
                 {
                    c=a[i][j];
                 }
             }
             System.out.println(c+" ");
         }
         
    }
    
}
