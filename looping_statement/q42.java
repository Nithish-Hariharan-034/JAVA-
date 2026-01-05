package looping_statement;
import java.util.*;
public class q42{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d=0,p=0;
           n=x.nextInt();
           while(n>0)
           {
                a=n%10;
                if(p==0)
                {
                   d=a;
                }
                if(p!=0&&a>d)
                {
                    d=a;
                }
                n=n/10;
                p++;

           }
           System.out.println("Larget Number: " +d);
           
     }
    
}
