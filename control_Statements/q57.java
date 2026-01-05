
package control_Statements;
import java.util.Scanner;
public class q57 {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in); 

    int z,y,p,d;
    p=x.nextInt();
    d=x.nextInt();
    switch(d)
    {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:{
            System.out.println("Prize=150");
            z=p*150;
            System.err.println("Total prize: "+z+"Rs");    
            }
            break;
        case 6:
        case 7:
            {
            System.out.println("Prize=200");
            z=p*200;
            System.err.println("Total prize: "+z+"Rs");    
            }    
        }        
     
    

   }
}
    

