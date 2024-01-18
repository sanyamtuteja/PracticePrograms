package Test01;

//2.Write a code to find the maximum product of triplet in an integer array.
//        [3,-3,0,-9,8]
//output: (-3*-9*8)


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class testZeta02 {
    public static void main(String[] args) {
        int[] arr = {-10, -3, -5, -6, -20};
        int n = arr.length;
        Arrays.sort(arr);

        // Return the maximum of product of last three
        // elements and product of first two elements
        // and last element
        int result =  Math.max(arr[0] * arr[1] * arr[n - 1],
                arr[n - 1] * arr[n - 2] * arr[n - 3]);
        System.out.println("    " +result);
        System.out.println(maxProduct(arr,n));
    }


    static int maxProduct(int arr[], int n) {
        // if size is less than 3, no triplet exists
        if (n < 3) {
            return -1;
        }
        // first priority queue of default order which is
        // lower value -> higher prioirty
        PriorityQueue<Integer> pqmin
                = new PriorityQueue<>();

        // second priority queue of rever order
        PriorityQueue<Integer> pqmax = new PriorityQueue<>(
                Comparator.reverseOrder());

        // iterating through array
        for (int i = 0; i < arr.length; i++) {

            pqmin.add(arr[i]);
            pqmax.add(arr[i]);
        }

        System.out.println(pqmax.toString());
        System.out.println(pqmin.toString());


        // initializing the maximum
        int maximum = pqmax.poll();
        // calculating product1
        int product1
                = maximum * pqmax.poll() * pqmax.poll();
        // calculating product2
        int product2
                = maximum * pqmin.poll() * pqmin.poll();

        // returning the maximum triplet product
        System.out.println(product2);
        System.out.println(product1);
        return product1 > product2 ? product1 : product2;
    }


//
//
//        Arrays.sort(arr);
////        -9, -3, 0, 3 , 8};
//        int maxProd = arr[n - 1] * arr[n - 2] * arr[n - 3];
//        int startingProd = arr[0] * arr[1] * arr[n-1];
//        if (startingProd > maxProd) {
//            System.out.println(startingProd);
//        } else {
//            for (int i = 1; i < n - 3; i++) {
//                startingProd = arr[i] * arr[i + 1] * arr[i + 2];
//                System.out.println(startingProd);
//            }
//        }

}
