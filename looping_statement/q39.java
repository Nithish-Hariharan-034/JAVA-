package looping_statement;
import java.util.*;
public class q39{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d,p=0;
           n=x.nextInt();
           while(n>0)
           {
                a=n%10;
                if(c!=0)
                     {
                        if(p>a)
                        {
                            p=2;
                            break;
                        }
                     }
                    p=a;
                n=n/10;
                c++;

           }
           System.out.println((p==2)?"No":"yes");
           
     }
    
}
