package array;
import java.util.Scanner;
public class q16 {

    public static void main(String[] args) {
        int n,c=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }

        for(int i=1;i<n;i++)
        {
             if(a[i]>a[i-1])
             {
                    c++;
                    break;
             }
        }
        System.out.println((c==1)?"No":"Yes");
    }
    
}
