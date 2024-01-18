package Test01;

import java.util.*;

public class testBliSmart  {
    public static void main(String[] args) {
        String s = "SanyamTuteja";
//op = s1n1y1m1j1e1u1t2a3

        s = s.toLowerCase();
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else
                map.put(s.charAt(i), 1);
        }
                System.out.println(map.descendingMap().toString());

        Map<Character, Integer> map1 = sortByValue(map);

        StringBuilder res = new StringBuilder("");
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            int value = ((int) entry.getValue());
                res.append(entry.getKey()).append(entry.getValue());

        }
        System.out.println(res);

    }

    private static Map<Character, Integer> sortByValue(TreeMap<Character, Integer> map) {
        List<Map.Entry<Character, Integer>> list =
                new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<Character, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry01 : list) {
            temp.put(entry01.getKey(), entry01.getValue());
        }
        return temp;
    }

}
