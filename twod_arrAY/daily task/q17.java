


import java.util.Scanner;
public class q17{
    public static void main(String args[])
    {
         int n,t;
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

        int c[][]=new int[t][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=0;
                for(int k=0;k<t;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++)
             System.out.print(c[i][j]+" ");
            System.out.println();
         }
    
     } 
    }