


import java.util.Scanner;
public class q21 {
    public static void main(String args[])
    {
         int n,t;
         boolean v=true;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         t=x.nextInt();
         int a[][]=new int[n][t];
         int b[][]=new int[n][t];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++)
            {
             a[i][j]=x.nextInt();
            }
         }
        
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                if(a[i][j]!=1)
                {
                    v=false;
                }
               }else
               if(a[i][j]!=0)
               {
                 v=false;
               }
            }
        }
        System.out.print((v)?"yes":"no");
    
     } 
    }