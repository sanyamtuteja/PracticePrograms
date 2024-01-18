package Test01;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = //{-2, -3, 4, -1, -2, 1, 5, -3};
                {-1,-2,-3,-4};
        int n = arr.length;

        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }else if (sum<0){
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
