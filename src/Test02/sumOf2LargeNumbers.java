package Test02;

public class sumOf2LargeNumbers {
    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "2";
        System.out.println(findSum(str1, str2));
    }

    public static String findSum(String s1, String s2) {
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();

        String finalStr = "";
        int n1 = s1.length();
        int n2 = s2.length();
        int carry = 0;
        for (int i = 0; i < n1; i++) {
            int sum = ((int)(s1.charAt(i) - '0') + (s2.charAt(i) - '0') + carry);
            finalStr +=((char) (sum%10 +'0'));
            carry = sum/10;
        }
        for (int i = n1; i < n2; i++) {
            int sum = ((int)(s2.charAt(i) - '0') + carry);
            finalStr += ((char)(sum%10 +'0'));
            carry = sum/10;
        }
        if (carry >0){
            finalStr += carry +'0';
        }
        finalStr = new StringBuilder(finalStr).reverse().toString();
    return finalStr;
    }
}
