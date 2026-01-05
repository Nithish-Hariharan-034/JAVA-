package control_Statements;
import java.util.Scanner;

public class q58 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double l,b=0;
        l=x.nextDouble();
        if(l<=1000)
        {
            b = 0;
        }
        else if(l<=3000) 
            {
            b=((l-1000)/1000)*5;
            System.out.print("Bill:"+b+"Rs");
        }
        else 
        {
            b=(2000.0/1000)*5; 
            b+=((l-3000)/1000)*10;
            System.out.print("Bill:"+b+"Rs");
        }

        
    }
}
