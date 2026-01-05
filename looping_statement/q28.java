package looping_statement;
import java.util.*;
public class q28{

     public static void main(String args[])
     {
           Scanner x=new Scanner(System.in);
           char a,r,b,t,ans;
           for(int i='a';i<'z';i++)
           {
             if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
             System.out.printf("%c",i);
           }
           System.out.println();
           
          for(int i='a';i<'z';i++)
           {
             if(i!='a'||i!='e'||i!='i'||i!='o'||i!='u')
             System.out.printf("%c",i);
           }
}
}
