package Test02;

public class reverseString {
//    1) reverse string
//    a) input: "vivek gupta" -- output: "gupta vivek"
//    b) input: "vivek gupta" -- output: "keviv atpug"

    public static void main(String[] args) {
        String s = "Sanyam Tuteja";
        System.out.println(namesReverse(s));
        System.out.println(wordReverse(s));

    }


    public static String nameReverse(String s) {
        StringBuilder reverse = new StringBuilder();
        if (s.length() < 2)
            return s;
        else {
            for (int i = s.length() - 1; i >= 0; i--) {
                reverse = reverse.append(s.charAt(i));

            }
            return reverse.toString();

        }
    }


    public static String wordReverse(String s) {
        String[] sArr = s.split("\\s");
        for (int i = 0; i < sArr.length; i++)
            System.out.println(sArr[i]);
        StringBuilder reverse = new StringBuilder();
        if (s.length() < 2)
            return s;
        for (String s0 : sArr) {
            for (int i = s0.length() - 1; i >= 0; i--) {
                reverse = reverse.append(s0.charAt(i));
            }
            reverse.append(" ");
        }
        return reverse.toString();
    }


    public static String namesReverse(String s) {
        String[] sArr = s.split("\\s");
        for (int i = 0; i < sArr.length; i++)
            System.out.println(sArr[i]);

        StringBuilder reverse = new StringBuilder();
        if (s.length() < 2)
            return s;
        for (int i = sArr.length - 1; i >= 0; i--) {
            reverse = reverse.append(sArr[i]);
            reverse.append(" ");

        }

        return reverse.toString();
    }

}
