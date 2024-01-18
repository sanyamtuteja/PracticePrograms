package Test03;

import java.util.Arrays;

public class testJunglee01 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1};

        int count0 = 0;
        int count1 = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else count1++;

        }
        System.out.println(count0 +"  " + count1);

        for (int i = 0; i < count1; i++) {
            arr[i] = 1;
        }
        for (int i = count1; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));


    }
}
