package Test01;

public class PalindromeInteger {
    public static void main(String[] args) {
        int n = 12121;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int t = 0;
        int temp = n;
        while (n > 0) {
            t = n % 10;
            reverse = (reverse * 10) + t;
            n = n / 10;
        }
        if (temp == reverse) {
            return true;
        } else
            return false;
    }
}
