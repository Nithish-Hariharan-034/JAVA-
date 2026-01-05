
package control_Statements;
import java.util.Scanner;
public class q41 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 

    int z,y;
    z=x.nextInt();
    if(z>9)
    {
          if(z==12)
          {
            z=1;
          }
          if(z==11||z==10)
          { 
            z=9;
          }
    }
    switch(z)
    {
        case 1:
        System.out.println("Winter");
        break;

        case 2:
        System.out.println("Winter");
        break;

        case 3:
        System.out.println("Spring");
        break;

        case 4:
        System.out.println("Spring");
        break;

        case 5:
        System.out.println("Spring");
        break;

        case 6:
        System.out.println("Summer");
        break;

        case 7:
        System.out.println("Summer");
        break;

        case 8:
        System.out.println("Summer");
        break;

        case 9:
        System.out.println("Fall");
        break;


        default:
        System.out.println("Invalid Input");
        break;
    }
     
    

   }
}
    

