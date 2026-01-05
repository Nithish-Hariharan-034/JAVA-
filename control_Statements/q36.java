
package control_Statements;
import java.util.Scanner;
public class q36 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    int a,m;
    m=x.nextInt();
    a=x.nextInt();

    
     if(((a%4==0&&a%100!=0)||(a%400==0)) && m<=12)
    {
        System.out.print("Valid");
         if(m==1 || m==3 || m==5||m==7||m==8||m==10||m==12 )
         {
            System.out.print("No of days in moth is 31");
         }
         else{
              if(m==2)
              {
                System.out.print("No of days in moth is 29");
              }
              else{
                System.out.print("No of days in moth is 30");
              }
         }
    }else{

    if(m<=12)
    {
          System.out.println("Valid");
          if(m==1 || m==3 || m==5||m==7||m==8||m==10||m==12 )
         {
            System.out.print("No of days in moth is 31");
         }
         else{
              if(m==2)
              {
                System.out.print("No of days in moth is 29");
              }
              else{
                System.out.print("No of days in moth is 30");
              }
         }
    }
    else
    {
         System.out.println("UNValid");
    }


    }

         
    
    
 }
}
    

