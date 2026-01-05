package array;
import java.util.Scanner;
public class q7 {
         public static void main(String args[])
         {
              Scanner x=new Scanner(System.in);
              int n,c=0;
              n=x.nextInt();
              int a[]=new int[n];
              for(int i=0;i<n;i++)
              {
                   a[i]=x.nextInt();
                   if(a[i]==0){
                    c++;}
              }
              System.out.println(c);
        }
    }            
