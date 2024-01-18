package Test01;
//Coins = {1,2,5}
//        Count =10 ;


import java.sql.SQLOutput;
import java.util.Arrays;

public class testLivspace02 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5};
        int n = 10;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        System.out.println(minCoin(n, a, dp));
    }

    public static int minCoin(int n, int[] a, int[] dp) {
        if (n == 0) return 0;

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (n - a[i] >= 0) {
                int subAns = 0;
                if (dp[n - a[i]] != -1) {
                    subAns = dp[n - a[i]];
                } else {
                    subAns = minCoin(n - a[i], a, dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return dp[n] =ans;
    }
}
