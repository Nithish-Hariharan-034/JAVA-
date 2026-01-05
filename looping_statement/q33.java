package looping_statement;
import java.util.*;
public class q33{

     public static void main(String args[])
     {
          /*  Scanner x=new Scanner(System.in);
           char a,r,t,ans;
           int b;
           a=x.next().charAt(0);
           b=a;
           b=b+32;
           System.out.printf("%c",b);*/
           int num=4;
           String y=Integer.toBinaryString(num);
           String x="";
           for(int i=0;i<y.length();i++)
           {
               if(y.charAt(i)=='1')
               { 
                  x=x+"0";
               }
               else{
                 x=x+"1";
               }
           }
           
           int p=Integer.parseInt(x,2);    
           System.out.println(p);
}
}
