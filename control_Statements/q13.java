package control_Statements;
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in); 
      int a,b,c;
      a=x.nextInt();
       if(a>0)
       {
        System.out.println("Positive");
       }
       else{
        if(a<0){
        System.out.println("Negative");}
        else{
            System.out.println("Zero");
        }
       }

    }
    
}
