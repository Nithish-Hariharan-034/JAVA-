
package control_Statements;
import java.util.Scanner;
public class q38 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 
    char a;
    int z,y;
    a=x.next().charAt(0);
    z=x.nextInt();
    y=x.nextInt();
    switch(a)
    {
        case '+':
        System.out.println(z+y);
        break;

        case '-':
        System.out.println(z-y);
        break;

        case 'x':
        System.out.println(z*y);
        break;

        case '/':
        System.out.println(z+y);
        break;

        case '%':
        System.out.println(z+y);
        break;

        default:
        System.out.println("Invalid Input");
        break;
    }
     
    

   }
}
    

