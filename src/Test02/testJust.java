package Test02;

import java.util.Arrays;

public class testJust {
    public static void main(String[] args) {

        int[] A = {22, 2, 34, 22, 16};

        //1,1,2,34,16
        int N = A.length;
        int X = 22;
        int[] result = new int[N];
        int countX = 0;
        int j = N - 1;
int i =N-1;
        while(i>=0) {
            if (A[i] == X) {

                countX += 1;
            } else {
                result[j--] = A[i];
            }
            i--;
        }


        for (int k = 0; k < countX; k++) {
            result[k] = 1;
        }
        System.out.println(Arrays.toString(result));
    }
}

