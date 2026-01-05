package pattern;

public class prac {
    public static void main(String[] args) {
        int n=5;
       for(int i=n;i>0;i--)

            {
                 for(int j=1;j<=n;j++)
                 {
                     if ( (i+j)>=(n+1))
                     System.out.print("*");
                    else
                        System.out.print(" ");

                 }
                 System.out.println();
            }

                 
    }
    
}
