
/*
Pattern printing
1
2 4
5 9 11
12 20 24 26
27 43 51 55 57
 */
public class DifficultPattern {
    public static void main(String args[]) {
        int n = 5;
        double a = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0, k= i+1 ; j<=i ; j++,k--)
            {

                if(j==0)
                    a=a+1;
                else
                    a = a+Math.pow(2,k);
                System.out.print((int)a + " ");
            }
            System.out.println();
        }
    }
}
