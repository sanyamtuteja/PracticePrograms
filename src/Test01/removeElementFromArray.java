package Test01;

public class removeElementFromArray {
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int n = arr.length;
        int x = 6;

        // Delete x from arr[]
        n = deleteElement(arr, n, x);
    }

    static int deleteElement(int arr[], int n, int x)
    {
        // Search x in array
        int i;
        for (i=0; i<n; i++)
            if (arr[i] == x)
                break;

        // If x found in array
        if (i < n)
        {
            // reduce size of array and move all
            // elements on space ahead
            n = n - 1;
            for (int j=i; j<n; j++)
                arr[j] = arr[j+1];
        }

        return n;
}
