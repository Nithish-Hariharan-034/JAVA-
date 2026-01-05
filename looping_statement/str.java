package looping_statement;
import java.util.*;

public class str {
    public static void main(String[] args) {
        int n,c=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        String u="";
        String y=String.valueOf(n);
        for(int i=0;i<y.length();i++)
        {
             if(y.charAt(0)=='6' && c==0) 
             {
                  u=u+"9";
                  c++;
             }
             else
             {
                    u=u+y.charAt(i);
             }
        }
        System.out.println(Integer.parseInt(u));
    }

}
    

