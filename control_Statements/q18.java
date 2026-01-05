package control_Statements;
import java.util.Scanner;
public class q18{
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
       if(a<10)
       {
        System.out.println("Single digit");
       }
       else{
        if(a>=10 &&a<100){
        System.out.println("two digit");
       }
       else
       {
           if(a>99&&a<1000)
           {
            System.out.print("Three digit");
           }
       }
    }

    }
    
}
