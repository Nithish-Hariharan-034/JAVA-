package looping_statement;
import java.util.*;
public class q19{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r,ans=0,b;
           a=x.nextInt();
           b=a*a;
           while(a!=0)
           {
               if(a%10!=b%10)
               {
                  ans++;
                  break;
               }
               a=a/10;
               b=b/10;
           }
           if(ans==0)
           {
            System.out.println("yes");
           }
           else{
            System.out.println("No");
           }
    
}
}
