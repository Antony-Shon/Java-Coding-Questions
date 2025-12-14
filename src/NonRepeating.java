
// Program to find second non-repeating character. If the values of count is changed to 'n' number then the nth non-repeating character can be found.
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {
    public static Character SecondNonRepeat(String s)
    {
        Map<Character,Integer> map = new LinkedHashMap<>(); // LinkedHashMap maintains insertion order
        for(int i=0;i<s.length();i++)
        {
            Character c = s.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }
            else {
                map.put(c,map.get(c)+1);
            }
        }
        int count = 2;
        for(Character c : map.keySet())
        {
            if(map.get(c) == 1)
            {
                count--;
                if(count == 0)
                    return c;
            }
        }
        return null;
    }
    public static void main(String args[])
    {
        String s = "Antony";
        Character ch = NonRepeating.SecondNonRepeat(s);
        System.out.println(ch);
    }
}
