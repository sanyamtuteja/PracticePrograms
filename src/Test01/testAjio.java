package Test01;
//print the second smallest

public class testAjio {

    public static void main(String[] args) {
        int[] arr = {22, -4, 7, 3, 3, 9, 7, 5};

        int min = arr[0];
        int secMin = 0;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i] ) {
                secMin = min;
                min = arr[i];
            } {
                secMin = arr[i];
            }
        }
        System.out.println(secMin);

    }
}
