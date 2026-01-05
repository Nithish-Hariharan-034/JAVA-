


import java.util.Scanner;
public class q2 {
    public static void main(String args[])
    {
         int n,t,c=0;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         t=x.nextInt();
         int a[][]=new int[n][t];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<t;j++){
             a[i][j]=x.nextInt();
             c+=a[i][j];

         }
        }
         System.out.print(c);
       
    
    }
    
}

