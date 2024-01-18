//package Test01;
//
//public class positiveEvenNegativeOdd {
//    public static void main(String args[]) {
//        int[] arr = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
//        int n = arr.length;
//        String str = "";
//        Character.is
//        for (int i = 0; i < n; i++) {
//            if (arr[i] >= 0 && i % 2 == 1) {
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[j] < 0 && j % 2 == 0) {
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                        break;
//                    }
//                }
//            } else if (arr[i] < 0 && i % 2 == 0) {
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[j] >= 0 && j % 2 == 1) {
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                        break;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//
//    }
//}
