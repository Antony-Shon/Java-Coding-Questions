import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//Identifies the non-repeating character
public class Banana
{
    public static void main(String args[]) {
        String word = "Banana";
        word = word.toLowerCase();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<word.length(); i++)
        {
            if(!(set.add(word.charAt(i))))
                map.put(word.charAt(i), map.get(word.charAt(i))+1);
            else
                map.put(word.charAt(i),1);
        }
        for (Character key : map.keySet())
        {
            if(map.get(key) == 1)
                System.out.println(key+ " = "+ map.get(key));
        }
    }
}
