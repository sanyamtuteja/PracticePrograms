package Test03;

import java.util.Arrays;

public class test033 {
    public static void main(String[] args) {
        int[] arr = {-10, -2, 5, -3, 8, -5, -8, -3, 7, 56, 43, 58, 0, 0, 90, -56, 0, -76};

        int j = 0;
        int count = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }


        }
        for(int i = j+1; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }


        }
        System.out.println(Arrays.toString(arr));

    }


}
