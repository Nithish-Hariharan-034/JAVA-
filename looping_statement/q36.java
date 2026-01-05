package looping_statement;
import java.util.*;
public class q36{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d;
           n=x.nextInt();
           d=x.nextInt();
           while(n>0)
           {
                
                a=n%10;
                if(a==d)
                {
                    c++;
                    break;
                }
                n=n/10;

           }
           System.out.println((c==0)?"not Occured":" occured");
           
     }
    
}
