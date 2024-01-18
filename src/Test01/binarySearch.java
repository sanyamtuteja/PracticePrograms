package Test01;

//Serach from an array using binary serach ..
//        int arr = {2,5,8,9,11,14,15,19,25,30}
//        key = 25 ,o/p yes
//        key = 35 ,o/p =no


public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 11, 14, 15, 19, 25, 30};
        int key = 100;
        binarySearch0(arr, 0, arr.length, key);
    }

    private static void binarySearch0(int[] arr, int start, int end, int key) {

        if (start == end) {
            System.out.println("not found");
            return;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == key) {
            System.out.println("Yes");
        }

        if (arr[mid] < key) {
            binarySearch0(arr, mid + 1, end, key);
        } else {
            binarySearch0(arr, start, mid - 1, key);
        }

    }

}
