package Test01;

import java.util.Arrays;

public class testpayNearby {
    protected testpayNearby() {
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 0, 5, 0, 33, 45, 13, 7, 0, 78, 0, 0, 2, 0};
        int n = arr.length;
        int count = n - 1;

        int i = 0;


        for (int j = i + 1; i < n - 1; i++) {
            if (arr[i] == 0) {


            }
        }


//        for (int i = n-1; i >0; i--) {
//            if (arr[i] != 0) {
//                arr[count--] = arr[i];
//            }
//        }
//        for (int i = count; i >=0; i--) {
//            arr[count--] = 0;
//
//        }
        System.out.println(Arrays.toString(arr));

    }
}
