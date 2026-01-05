package control_Statements;
import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    char y;
    y= x.next().charAt(0);
    if(y=='a' || y=='e' || y=='i' || y=='o'||y=='u'||y=='A'||y=='I'||y=='O'||y=='E'||y=='U') 
    {
         System.out.print("Vowels");
    }
    else{
            System.out.print("Consonents");
    }



    }
    
}
