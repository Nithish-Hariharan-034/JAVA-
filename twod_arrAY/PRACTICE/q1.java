package twod_arrAY;


import java.util.Scanner;
public class q1 {
    public static void main(String args[])
    {
         int n,t;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         t=x.nextInt();
         int a[][]=new int[n][t];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++)
             a[i][j]=x.nextInt();
         }
         int m=a[0][0];
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<t;j++)
             {
                 if(m<a[i][j])
                 {
                    m=a[i][j];
                 }
             }
         }
         System.out.println(m);
         
    }
    
}
