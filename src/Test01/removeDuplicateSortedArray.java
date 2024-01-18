package Test01;

public class removeDuplicateSortedArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        int m = removeDuplicates(arr, n);
        System.out.println("int " +m);
    }

    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];

        return j;
    }

}
