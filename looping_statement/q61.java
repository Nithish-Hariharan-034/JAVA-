package looping_statement;
import java.util.*;
public class q61{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int n,c=0,a=0,d=0,p=0;
           n=x.nextInt();
           if(n>0){
           do{
               a=a+n;
               n=x.nextInt();

           }while(n>0);}
           else
           {
               System.out.print("Can't First Number Negative");
           }
           System.out.println(a);
           
     }
    
}
