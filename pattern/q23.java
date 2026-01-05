package pattern;
import java.util.*;
public class q23 {
    public static void  main(String args[])
    {
         int a,b,c=1,n,d;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n-1-i;j++)
             {
                System.out.print(" ");
             }
             for(int k=0;k<i+1;k++)
             {
                 if(k==0)
                 {
                    c=1;
                 }
                 else{
                    c=c*(i-k+1)/k;}
                    System.out.print(c+" ");
                 
             }
             System.out.println();
         }
    }
    
}

/*package pattern;
import java.util.*;
public class q23 {
    public static void  main(String args[])
    {
         int a,b,c=1,n,d;
         Scanner x=new Scanner(System.in);
         n=x.nextInt();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n-i-1;j++)
             {
                System.out.print(" ");
             }
             for(int k=0;k<i+1;k++)
             {
                 if(k==0)
                    c=1;
                 else 
                    c=c*(i-k+1)/k;
                 System.out.print(c+" ");
             }
             System.out.println();
         }
    }
    
}
*/
