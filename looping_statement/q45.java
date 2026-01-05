package looping_statement;
import java.util.*;
public class q45{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d=0,p=0,e=0,o=0;
           n=x.nextInt();
           while(n>0)
           {
                c++;
                a=n%10;
                if(a%2==0)
                {
                       e=e+a;}
                else{
                    o=o+a;}
                n=n/10;    
            }

             System.out.println((e>o)?e-o:o-e);
    
} }
