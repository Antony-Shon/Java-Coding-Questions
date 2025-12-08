import java.util.HashSet;
import java.util.Set;
//To identify the Characters in a string appearing odd number of times
public class OddTimes
{
    public static void main(String args[]) {
        String word = "Banana";
        word = word.toLowerCase();
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<word.length(); i++)
        {
            if(!(set.add(word.charAt(i))))
                set.remove(word.charAt(i));
        }
        System.out.println(set);
    }
}
