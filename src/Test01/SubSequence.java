package Test01;

public class SubSequence {

    /*
     * Click `Run` to execute the snippet below!
     */


//  Given two strings, find if first string is a subsequence of second
//  Input: str1 = "AXY", str2 = "ADXCPY"
// Output: True (str1 is a subsequence of str2)

// Input: str1 = "AXY", str2 = "YADXCP"
// Output: False (str1 is not a subsequence of str2)

// Input: str1 = “ntsksur”, str2 = “netskopesecurity”
// Output: True (str1 is a subsequence of str2)

    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */

//str1 = "AAB"
//str2-  "Abzxcvbn"


    public static void main(String[] args) {
        String str1 = "Nikhil";
        String str2 = "Nikhia";
        System.out.println(str1.compareToIgnoreCase(str2));
        if (str1.length() > str2.length()) {
            System.out.println("false");
        } else if (str1.length() == 0 || str2.length() == 0) {
            System.out.println("false");
        }

        int count = 0;
        int k = 0;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if ((ch1[i] == ch2[j]) && j >= k) {
                    count += 1;
                    k = j;
                    break;
                }

                // System.out.println(j);
            }
            if (count == ch1.length) {
                System.out.println("True");
            } else System.out.println("False");

        }


    }

}
