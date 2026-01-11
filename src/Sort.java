
//Program to find the nth largest and nth smallest element using Streams
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Sort {
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(100);
        list.add(-1);
        list.add(-5);
        list.add(0);
        list.add(39);

        int n = 3;

        Optional<Integer> NthSmallest = list.stream().sorted().skip(n-1).findFirst();
        Optional<Integer> NthLargest = list.stream().sorted().skip(list.size()-n).findFirst();
        System.out.println("Nth Smallest Element = "+NthSmallest);
        System.out.println("Nth Largest Element = "+NthLargest);
    }
}
