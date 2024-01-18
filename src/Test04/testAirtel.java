package Test04;

import javax.print.DocFlavor;

public class testAirtel {

    public static void main(String[] args) {
        String str = "sedacbbcadenbbsnkjk";
        boolean check = false;


        for (int i = 0; i < str.length(); i++) {
            StringBuilder temp = new StringBuilder();
            temp .append(str.charAt(i));
            for (int j = i + 1; j < str.length() - 1; j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    temp.append(str.charAt(j));
                }else{
                    System.out.println(temp.toString());
                    check = checkPalindrome(temp);
                    System.out.println(check);
                    break;
                }

            }
        }


    }

    private static boolean checkPalindrome(StringBuilder temp) {
        StringBuilder rev = temp.reverse();
        System.out.println( rev);

        return temp.equals(rev);

    }


}
