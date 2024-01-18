package Test01;

import java.util.HashMap;
import java.util.Map;

public class test001 {
    public static void main(String[] args) {
        String str = "aaabbbbbbaaccccccccc";

        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : ch) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        int max = 0;
        char key = 0;
        System.out.println(map);
        for (Map.Entry entry : map.entrySet()) {
            int temp = (int) entry.getValue();
            if (temp > max) {
                max = (int) entry.getValue();
                key = (char) entry.getKey();
            }

        }
        System.out.println(key +" "+max);
    }

}
