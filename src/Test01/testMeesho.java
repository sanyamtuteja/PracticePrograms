package Test01;

//a < b > c < d > e < f.
//        Input: arr[] = {4, 3, 7, 8, 6, 2, 1}
//        Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
//
//        Input: arr[] = {1, 4, 3, 2}
//        Output: arr[] = {1, 4, 2, 3}
//{1, 2, 3, 4, 5, 6}


import java.util.Arrays;

public class testMeesho {
    public static void main(String[] args) {

//1< 3> 2< 5> 4< 7>6
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    int temp2 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp2;
//                    System.out.println(Arrays.toString(arr));
                }
            } else if (arr[i] < arr[i + 1]) {
                int temp2 = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp2;
//                System.out.println(Arrays.toString(arr));

            }

        }

//
//        if (arr[i] < arr[i - 1] && (i % 2 != 0)) {
//            int temp = arr[i];
//            arr[i] = arr[i - 1];
//            arr[i - 1] = temp;
////                System.out.println(Arrays.toString(arr));
//
//            if (i < n - 1) {
//                if (arr[i] < arr[i + 1]) {
//                    int temp2 = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp2;
//                }
//            }
////                System.out.println(Arrays.toString(arr));
//
//        }
//    }
        System.out.println(Arrays.toString(arr));

    }

}
