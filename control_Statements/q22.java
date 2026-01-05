package control_Statements;
import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    char y;
    int c;
    y= x.next().charAt(0);
    c=y;
    if(y>=65 && y<=90) 
    {
         System.out.print("Upper Case");
    }
    else{
           if(y>=97 && y<=122)
            System.out.print("Lowercase");
        else
        {
              if(y>=48 && y<=59){
                 System.out.println(" digit");
              }
              else
              { 
                System.out.print("Symbols");
              }
        }
    }
    


    }
    
}
