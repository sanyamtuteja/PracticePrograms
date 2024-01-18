package Test02;

import java.util.ArrayList;
import java.util.List;

public class matrix {
//    print given metrix as per op
//    input 1 2 3
//          4 5 6
//          7 8 9
//  output --- 1, 4, 2, 7, 5, 3, 8, 6, 9
//    (00,01,10,02,11,20,21,12,22)

    public static void main(String[] args) {

        final int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printPattern(matrix, matrix.length, matrix.length);
    }

    public static void printPattern(int[][] matrix, int m, int n) {
        List<Integer> ans = new ArrayList<>();

        for (int k = 0; k < m ; k++) {
            int i = k;
            int j = 0;
            while (i >= 0) {
                ans.add(matrix[i][j]);
                i = i - 1;
                j = j + 1;
            }
        }

        for (int k = 1; k < n; k++) {
            int i = m-1;
            int j = k;
            while (j <= n-1) {
                ans.add(matrix[i][j]);
                i = i - 1;
                j = j + 1;
            }
        }
        System.out.println(ans);

    }

}
