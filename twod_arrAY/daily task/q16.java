


import java.util.Scanner;
public class q16 {
    public static void main(String args[])
    {
         int n,t,c;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         t=x.nextInt();
         int a[][]=new int[n][t];
         int b[][]=new int[n][t];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++)
             a[i][j]=x.nextInt();
         }
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++)
             b[i][j]=x.nextInt();
         }
         
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]-b[i][j]+" ");
            }
            System.out.println();
         }
         }
         
    }
    

