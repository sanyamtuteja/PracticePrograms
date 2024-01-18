package Test01;


//Q1) Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
//        Example 1:
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].

import java.util.Arrays;

public class testGrowww {
    public static void main(String[] args) {

        int[] arr = {-7,-3,2,3,11};
        int n = arr.length;
        int last = n - 1;
        int start = 0;
        int[] square = new int[n];
        for (int i = n - 1; i > 0; i--) {
            if (Math.abs(arr[start]) > Math.abs(arr[last])) {
                square[i] = arr[start] * arr[start];
                start++;
            } else {
                square[i] = arr[last] * arr[last];
                last--;
            }

        }
        for (int i = 0; i < n; i++)
            arr[i] = square[i];

        System.out.println(Arrays.toString(square));

}


}
