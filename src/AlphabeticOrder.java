import java.util.Arrays;
//Arrange a string in alphabetic order
public class AlphabeticOrder {
    public static void main(String args[])
    {
        String word = "Gopika";
        word = word.toLowerCase();
        int l = word.length();
        int S[] = new int[l];
        for(int i=0; i<l; i++)
        {
            S[i] = (int) word.charAt(i);
        }
        Arrays.sort(S);
        for(int i=0; i<l; i++)
        {
            System.out.print((char)S[i]);
        }
    }
}
