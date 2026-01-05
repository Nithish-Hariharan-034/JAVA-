package looping_statement;
import java.util.*;
public class q48{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c,a=0,d,p=0;
           n=x.nextInt();
           c=n;
           while(c>0)
           {
               d=c%10;
               p=(p*10)+d;
               c=c/10;
           }
           while(p>0)
           {
              a=p%10;
              switch (a) 
              {
                case 1:
                System.out.println("One");    
                break;
                case 2:
                System.out.println("Two");    
                break;
                case 3:
                System.out.println("Three");    
                break;
                case 4:
                System.out.println("Four");    
                break;
                case 5:
                System.out.println("Five");    
                break;
                case 6:
                System.out.println("Six");    
                break;
                case 7:
                System.out.println("Seven");    
                break;
                case 8:
                System.out.println("Eight");    
                break;
                case 9:
                System.out.println("nine");    
                break;
                default:
                System.out.println("Zero");    
                break;
              }
              p=p/10;
           }
           
           
     }
    
}
