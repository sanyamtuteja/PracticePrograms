package test05;
//nput = 00001234506
//Output 1234506
// truncating the zeros

public class test002 {
    public static void main(String[] args) {
        String s = "00001234506";
truncate(s);
    }

    static void truncate(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) != '0')) {
                str.append(s.substring(i,s.length()));
                break;
            }
        }
        System.out.println(str);
    }
}

