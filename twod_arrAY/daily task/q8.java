           



import java.util.Scanner;
public class q8 {
    public static void main(String args[])
    {
         int n,t,c=Integer.MAX_VALUE;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         t=x.nextInt();
         int a[][]=new int[n][t];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++)
            {
             a[i][j]=x.nextInt();
            }
         }

         for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++)
            {
                if(c>a[i][j])
                {
                    c=a[i][j];
                }
            }
            
         }
         System.out.print(c+" ");
        
       
    
    }
    
}

