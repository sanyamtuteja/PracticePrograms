package Test03;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

// Start typing here
// N = 6
// arr[] = 7 10 4 3 20 15
// K = 3
// Output : 7
public class test02 extends test{
    

    static int Kth_smallest(TreeMap<Integer, Integer> m,
                            int k)
    {
        int freq = 0;
        for (Map.Entry it : m.entrySet())
        {
            System.out.println(it.getKey()+"  --  " + it.getValue());
            // adding the frequencies of each element
            freq += (int)it.getValue();
            System.out.println("freq : "+ freq);
            // if at any point frequency becomes
            // greater than or equal to k then
            // return that element
            if (freq >= k) {
                return (int)it.getKey();
            }
        }

        return -1; // returning -1 if k>size of the array
        // which is an impossible scenario
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 5;
        int k = 2;
        int[] arr = { 12, 3, 3, 7, 19 };
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            // mapping every element with
            // it's
            // frequency
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry it : m.entrySet())
        {
            System.out.println(it.getKey()+"  --  " + it.getValue());}
        int ans = Kth_smallest(m, k);

        System.out.println(
                "The " + k + " smallest element is " + ans);
    }
}
