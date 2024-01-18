package Test01;

//Find the pair of numbers in an array with a given sum.
//        printPairs(int sum, int[] arr) {}
//
//        sum = 10
//        2.5.3.8.13.7.10,8,5,2,-3,2,5,11,-1

import java.util.HashMap;

public class testNearBy02 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 13, 7, 10, 8, 5, 2, -3,0,11,-1};
//        int[] arr = {10,0};
        int n = arr.length;
        int sum = 10;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = Math.subtractExact(sum,arr[i]);

            if (map.containsKey(diff)) {
                System.out.println(arr[i] + "   ---  " + diff);
            } else
                map.put(arr[i], diff);
        }
    }


}
