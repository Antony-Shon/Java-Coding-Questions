import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Remove duplicates from an Array
public class RemoveDuplicate {
    public static void main(String args[])
    {
        int A[] = {2,3,2,4,5,3,6,4,8};
        Set<Integer> s = new HashSet<>();
        for(int i = 0 ; i<A.length ; i++)
        {
            s.add(A[i]);
        }
        System.out.println(s);
    }
}
