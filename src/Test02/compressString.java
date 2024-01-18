package Test02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class compressString {
//    String compression
//    a) input: "aaabbcddaa" output: "a3b2cd2a2"
//    b) input: "a3b2cd2a2" output: "a5b2cd2"

    public static void main(String[] args) {
        String s = "aaabbcddaa";
        String s1 = "a3b2cd2a2";
//        System.out.println(compression01(s));
        System.out.println(compression02(s1));

    }


    public static String compression01(String s) {
        StringBuilder compressed = new StringBuilder();
        char[] charArr = s.toCharArray();
        int count = 0;

        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    count++;
                } else {
                    compressed.append(charArr[i]).append(count + 1);
                    count = 0;
                }
                i++;
            }

        }
        return compressed.toString();
    }


    public static String compression02(String s) {
        StringBuilder compressed = new StringBuilder();
        char[] charArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                if (Character.isDigit(s.charAt(i+1))) {
                    if (!map.containsKey(charArr[i])) {
                        map.put(s.charAt(i), Character.getNumericValue(s.charAt(i + 1)));
                    } else {
                        map.put(s.charAt(i), map.get(s.charAt(i)) + (Character.getNumericValue(s.charAt(i + 1))));
                    }
                }else{
                    map.put(s.charAt(i), 1);
                }
            }
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            {
                compressed = compressed.append(entry.getKey()).append(entry.getValue());
            }
        }
        return compressed.toString();
    }

}
