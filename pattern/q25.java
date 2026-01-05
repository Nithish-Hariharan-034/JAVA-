package pattern;
import java.util.Scanner;
public class q25 {
    public static void main(String args[])
    {
          int n;
          Scanner x=new Scanner(System.in);
          n=x.nextInt();
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n-i-1;j++)
              {
                System.out.print(" ");
              }
              int a=65;
              for(int k=0;k<=i;k++)
              {
                System.out.printf("%c",(a+32));a++;
              }
              for(int l=64+i;l>64;l--)
              {
                System.out.printf("%c",l+32);
              }
              System.out.println();
          }
    }
    
}
