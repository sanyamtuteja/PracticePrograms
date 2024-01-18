package test05;

//Move zeros to End
//
// 1,0,3,4,0,5,0,7
//1,3,4,5,7,0,0,0


import java.util.Arrays;

public class test001 {
    public static void main(String[] args) {

        int a[] = {1, 0, 3, 4, 0, 5, 0, 7};
        move0ToEnd(a);

    }

    public static void move0ToEnd(int[] a) {

        int count = 0;
        int arr[] = new int[a.length];
        Arrays.fill(arr, -1);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                arr[j] = a[i];
                j++;
            }
        }
        for (int i = a.length - count; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
