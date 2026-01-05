package looping_statement;
import java.util.*;
public class q37{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d,p=0;
           n=x.nextInt();
           d=x.nextInt();
           while(n>0)
           {
                p++;
                a=n%10;
                if(a==d)
                {
                    c++;
                }
                n=n/10;

           }
           System.out.println("Occurence: "+c);
           
     }
    
}
