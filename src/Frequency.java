import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//Frequency of each string in an Array of Strings - This can be applicable for words as well, if all words are given in same case.
public class Frequency {
    public static void main(String[] args) {
        int A[] = {1,3,2,5,3,4,8,2,0,0,2};
        String S[] = {"2701169543","2701197813","2303728719","2701169542","2700575245","2319835647","2702089739","2701169549","2701169547","2320486208","2701169548","2701051499","2320417830","2701219984","2700971443","2701261960","1927177066","2701173087","2701173088","2702080262","2701057384","2320674665","2701102214","2701166547","2320549958","2320663377","2319743955","2320549959","2320592567","2701050821","2320310540","2320549960","2701182641","2701104892","2320230698","2320502931","2702076459","2320464095","2700647430","2319843232","2320679423","2320522280"};
        Frequency obj = new Frequency();
        obj.ans(S);
    }
    public void ans(String nums[])
    {
        Map<String,Integer> m = new HashMap<String,Integer>();
        Set<String> str = new HashSet<String>();
        for(int i=0; i<nums.length ; i++)
        {
            String key = nums[i].toUpperCase();
            if(m.containsKey(key))
                m.put(key,m.get(key)+1);
            else {
                str.add(key);
                m.put(key, 1);
            }
        }
        System.out.println(str.size());
        System.out.println(nums.length);
        System.out.println(m);
    }
}