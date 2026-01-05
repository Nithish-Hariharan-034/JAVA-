package looping_statement;
import java.util.*;
public class q30{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           int a,r=0,t=0,ans;
           int b;
           b=x.nextInt();
           String s=Integer.toBinaryString(b);

           for(int i=0;i<s.length();i++)
           {
              char p =s.charAt(i);
               if(p=='0')
               {
                  r++;
               }
               else if(p=='1'){
                    t++;
               }
           }
           System.out.print("0: "+r+"\t1: "+t);
           
    
}
}
