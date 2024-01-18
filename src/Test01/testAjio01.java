package Test01;


// first non repeated char
public class testAjio01 {

    public static void main(String[] args) {
        String s = "Sanyams tuteja";

        char c = s.charAt(0);
//        char[] ch = s.toCharArray();

        for (int i = 1; i < s.length(); i++) {
            if (c != s.charAt(i)) {
                c= s.charAt(i);

            }
        }
        System.out.println(c);
    }
}
