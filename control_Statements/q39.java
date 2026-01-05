
package control_Statements;
import java.util.Scanner;
public class q39 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 

    int z,y;
    z=x.nextInt();
    int a =z/10;
    switch(a)
    {
        case 10:
        case 9:
        System.out.println("A");
        break;

        case 8:
        System.out.println("B");
        break;

        case 7:
        System.out.println("C");
        break;


        default:
        System.out.println("Fail");
        break;
    }
     
    

   }
}
    

