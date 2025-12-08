import java.util.HashMap;
import java.util.Map;
//Occurance of each character in a string
public class CharacterOccurance {
    public static void main(String args[])
    {
        String s = "Antony Shon";
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            Character c = s.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        System.out.println(map);
    }
}
