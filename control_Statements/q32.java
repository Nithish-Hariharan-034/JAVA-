package control_Statements;
import java.util.*;
public class q32//q5
{
        public static void main(String args[])
        {
            double x1,x2,y1,y2;
            Scanner x=new Scanner(System.in);
            x1=x.nextDouble();
            x2=x.nextDouble();
            y1=x.nextDouble();
            y2=x.nextDouble();
            double z1,z2,ans;
            z1=(x2-x1)*(x2-x1);
            z2=(y2-y1)*(y2-y1);
            ans=z1+z2;
            System.out.println(Math.sqrt(ans));

        }
}
    

